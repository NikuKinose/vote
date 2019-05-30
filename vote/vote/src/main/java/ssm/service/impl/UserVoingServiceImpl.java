package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dto.CountVotingDTO;
import ssm.dto.VotingResultDTO;
import ssm.mapper.SchemeMapper;
import ssm.mapper.UserVotingMapper;
import ssm.mapper.VoteOptionMapper;
import ssm.pojo.*;
import ssm.service.UserVotingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.*;

@Service
public class UserVoingServiceImpl implements UserVotingService {
    @Autowired
    SchemeMapper schemeMapper;

    @Autowired
    UserVotingMapper userVotingMapper;

    @Autowired
    VoteOptionMapper voteOptionMapper;
    @Override
    public List<UserVoting> selectUserVoting(int VotingId,Integer round) {
        UserVotingExample userVotingExample = new UserVotingExample();
        UserVotingExample.Criteria criteria = userVotingExample.createCriteria();
        criteria.andVotingIdFkEqualTo(VotingId);
        criteria.andUserVotingRoundEqualTo(round);

        List<UserVoting> userVotingList =  userVotingMapper.selectByExample(userVotingExample);
        return userVotingList;
    }























    @Override
    public int VotingCount(int SchemeId,int Round,int OptionId){
        UserVotingExample userVotingExample = new UserVotingExample();
        UserVotingExample.Criteria criteria = userVotingExample.createCriteria();
        criteria.andSchemeIdFkEqualTo(SchemeId);
        criteria.andUserVotingRoundEqualTo(Round);
        criteria.andOptionIdFkEqualTo(OptionId);
        List<UserVoting> userVotingList =  userVotingMapper.selectByExample(userVotingExample);
        return  userVotingList.size();
    }


    public int UserCount(int SchemeId){
        UserVotingExample userVotingExample = new UserVotingExample();
        UserVotingExample.Criteria criteria = userVotingExample.createCriteria();
        criteria.andSchemeIdFkEqualTo(SchemeId);    //每个用户一定会对一个方案进行投票
        List<UserVoting> userIdList = userVotingMapper.selectByExample(userVotingExample);  //对于一个方案的投票的用户存在List里面
        return userIdList.size();  //返回List的大小即人数
    }

    public List<CountVotingDTO> findScheme(HttpServletRequest request) {
        //获取user_voting表中的所有数据
        UserVotingExample userVotingExample = new UserVotingExample();
        List<UserVoting> userVotingList = userVotingMapper.selectByExample(userVotingExample);

        //获取选项号和选项名称
        Map<Integer,String> voteMap = new HashMap<>();  //选项号+选项名
        VoteOptionExample voteOptionExample = new VoteOptionExample();
        List<VoteOption> voteOptionList = voteOptionMapper.selectByExample(voteOptionExample);
        for (int i = 0;i<voteOptionList.size();i++){
            voteMap.put(voteOptionList.get(i).getVoteOptionId(),voteOptionList.get(i).getVoteOptionName());
        }

        //获取方案号和方案名
        Map<Integer,String> schemeMap = new HashMap<>();  //方案号+方案名
        SchemeExample schemeExample = new SchemeExample();
        List<Scheme> schemeList = schemeMapper.selectByExample(schemeExample);
        for (int i = 0;i<schemeList.size();i++){
            schemeMap.put(schemeList.get(i).getSchemeId(),schemeList.get(i).getSchemeName());
        }

        List<CountVotingDTO> countVotingDTOs = new ArrayList<>();

        int countVote = 0;  //得票数

        for (int i=0; i<userVotingList.size();i++){
            CountVotingDTO countVotingDTO = new CountVotingDTO();

            countVotingDTO.setSchemeId(userVotingList.get(i).getSchemeIdFk());  //方案号
            countVotingDTO.setOptionId(userVotingList.get(i).getOptionIdFk());  //选项号
            countVotingDTO.setSchemeName(schemeMap.get(userVotingList.get(i).getSchemeIdFk())); //方案名
            countVotingDTO.setOptionName(voteMap.get(userVotingList.get(i).getOptionIdFk())); //选项名

            //统计票数，以后有不同的票数统计方法，可以通过添加参数在这里改变计票方法，别的内容不变
            for (int j=0;j<userVotingList.size();j++){
                //判断方案号是否相等,且投票轮次也应该相等，若都相等且投票结果为1（即支持），则得票数+1
                if(userVotingList.get(i).getSchemeIdFk()==userVotingList.get(j).getSchemeIdFk()
                        &&userVotingList.get(i).getUserVotingRound()==userVotingList.get(j).getUserVotingRound()
                        &&userVotingList.get(j).getOptionIdFk()==1){
                    countVote++;
                }
            }

            countVotingDTO.setVoteNumber(countVote);

            countVotingDTOs.add(countVotingDTO);
        }
        HttpSession session = request.getSession();
        session.setAttribute("NeedSchemes",countVotingDTOs);
        return countVotingDTOs;
    }





    @Override  //单选项投票
    public void voteOne( HttpServletRequest request,int [] arr,int userVotingRound) {
        Vector vector = new Vector(1,1);
        Enumeration resultParams = request.getParameterNames();
        //将发送请求页面中form表单里所有具有name属性的表单对象获取(包括button).返回一个Enumeration类型的枚举
        while (resultParams.hasMoreElements()){
            String resultParam = (String) resultParams.nextElement();
            Integer existVector = Integer.parseInt(resultParam);
            vector.addElement(existVector);
        }
        //获取方案总数
        SchemeExample schemeExample = new SchemeExample();
        Integer count = schemeMapper.countByExample(schemeExample);

        //获取用户Id
        HttpSession session = request.getSession();
        Integer userIdFk = (Integer) session.getAttribute("userIdSession");

        for (int i = 0;i<count;i++){
            UserVoting userVoting = new UserVoting();
            userVoting.setUserIdFk(userIdFk);
            userVoting.setSchemeIdFk(arr[i]);
            userVoting.setUserVotingRound(userVotingRound);
            if(vector.contains(arr[i])){
                userVoting.setOptionIdFk(2);  //2：支持
            }else {
                userVoting.setOptionIdFk(1);  //1：反对
            }
            userVotingMapper.insert(userVoting);
        }
    }

    @Override   //多选项投票
    public void manyVoteOne(HttpServletRequest request, int[] arr,int userVotingRound) {
        Map<Integer,Integer> map = new HashMap<>();
        Enumeration resultParams = request.getParameterNames();
        //将发送请求页面中form表单里所有具有name属性的表单对象获取(包括button).返回一个Enumeration类型的枚举
        while (resultParams.hasMoreElements()){
            String resultParam = (String) resultParams.nextElement(); //属性name的名称
            String resultValue = request.getParameter(resultParam);   //对应value的值

            //强制转换为整形数据
            Integer existMap = Integer.parseInt(resultParam);
            Integer existValue = Integer.parseInt(resultValue);
            map.put(existMap,existValue);
        }
        //获取方案总数
        SchemeExample schemeExample = new SchemeExample();
        Integer count = schemeMapper.countByExample(schemeExample);



        //获取用户Id
        HttpSession session = request.getSession();
        Integer userIdFk = (Integer) session.getAttribute("userIdSession");

        for (int i = 0;i<count;i++){
            UserVoting userVoting = new UserVoting();
            userVoting.setUserIdFk(userIdFk);
            userVoting.setSchemeIdFk(arr[i]);
            userVoting.setUserVotingRound(userVotingRound);
            if(map.containsKey(arr[i])){
                userVoting.setOptionIdFk(map.get(arr[i]));
            }else {
                userVoting.setOptionIdFk(7); //7：不合格
            }
            userVotingMapper.insert(userVoting);
        }
    }

    @Override  //多选项排序式投票
    public void manyVote(HttpServletRequest request, int[] arr,int userVotingRound) {}


    @Override
    public List<VotingResultDTO> findScheme() {
        List<VotingResultDTO> votingResultDTOS = new ArrayList<>();

        SchemeExample schemeExample = new SchemeExample();
        List<Scheme> schemeList = schemeMapper.selectByExample(schemeExample);

        for (int i = 0;i<schemeList.size();i++){
            VotingResultDTO votingResultDTO = new VotingResultDTO();
            votingResultDTO.setSchemeId(schemeList.get(i).getSchemeId());
            votingResultDTO.setSchemeName(schemeList.get(i).getSchemeName());
            votingResultDTO.setOptionId(0);
            votingResultDTO.setVoteNumber(0);
            votingResultDTO.setOptionName(null);
            votingResultDTOS.add(votingResultDTO);
        }
        return votingResultDTOS;
    }

    @Override
    public List<VotingResultDTO> findSchemeBysession(HttpSession session) {
        //获取user_voting表中的所有数据
        UserVotingExample userVotingExample = new UserVotingExample();
        List<UserVoting> userVotingList = userVotingMapper.selectByExample(userVotingExample);

        //获取选项号和选项名称
        Map<Integer,String> voteMap = new HashMap<>();  //选项号+选项名
        VoteOptionExample voteOptionExample = new VoteOptionExample();
        List<VoteOption> voteOptionList = voteOptionMapper.selectByExample(voteOptionExample);
        for (int i = 0;i<voteOptionList.size();i++){
            voteMap.put(voteOptionList.get(i).getVoteOptionId(),voteOptionList.get(i).getVoteOptionName());
        }

        //获取方案号和方案名
        Map<Integer,String> schemeMap = new HashMap<>();  //方案号+方案名
        SchemeExample schemeExample = new SchemeExample();
        List<Scheme> schemeList = schemeMapper.selectByExample(schemeExample);
        for (int i = 0;i<schemeList.size();i++){
            schemeMap.put(schemeList.get(i).getSchemeId(),schemeList.get(i).getSchemeName());
        }

        List<VotingResultDTO> votingResultDTOS = new ArrayList<>();

        for (int i=0; i<userVotingList.size();i++){
            int countVote = 0;  //得票数
            VotingResultDTO votingResultDTO = new VotingResultDTO();

            votingResultDTO.setSchemeId(userVotingList.get(i).getSchemeIdFk());  //方案号
            votingResultDTO.setOptionId(userVotingList.get(i).getOptionIdFk());  //选项号
            votingResultDTO.setSchemeName(schemeMap.get(userVotingList.get(i).getSchemeIdFk())); //方案名
            votingResultDTO.setOptionName(voteMap.get(userVotingList.get(i).getOptionIdFk())); //选项名

            //统计票数，以后有不同的票数统计方法，可以通过添加参数在这里改变计票方法，别的内容不变
            for (int j=i;j<userVotingList.size();j++){
                //判断方案号是否相等,且投票轮次也应该相等，若都相等且投票结果为1（即支持），则得票数+1
                if(userVotingList.get(i).getSchemeIdFk()==userVotingList.get(j).getSchemeIdFk()
                        &&userVotingList.get(i).getUserVotingRound()==userVotingList.get(j).getUserVotingRound()
                        &&userVotingList.get(j).getOptionIdFk()==1){
                    countVote++;
                }
            }

            votingResultDTO.setVoteNumber(countVote);

            votingResultDTOS.add(votingResultDTO);
        }

        //删掉重复的方案
        for (int s = 0;s<votingResultDTOS.size()-1;s++){
            for (int m=s+1;m<votingResultDTOS.size();m++){
                if (votingResultDTOS.get(s).getSchemeId()==votingResultDTOS.get(m).getSchemeId()){
                    votingResultDTOS.remove(m);
                }
            }
        }
        System.err.println("最终DTO的数据为"+Arrays.toString(new List[]{votingResultDTOS}));
        session.setAttribute("NeedSchemes",votingResultDTOS);
        return votingResultDTOS;
    }

    @Override
    public String addVoteList(ArrayList<UserVoting> userVotingArrayList){
        int total=0;
        for (int i=0;i<userVotingArrayList.size();i++) {
            total+=userVotingMapper.insert(userVotingArrayList.get(i));
        }

        if (total==userVotingArrayList.size()){
            return "OK";
        }
        else{
            return "FALSE";
        }
    }

}
