package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dto.VotingResultDTO;
import ssm.mapper.SchemeMapper;
import ssm.mapper.UserVotingMapper;
import ssm.mapper.VotingMapper;
import ssm.pojo.*;
import ssm.service.VotingResultService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class VotingResultServiceImpl implements VotingResultService {

    @Autowired
    UserVotingMapper userVotingMapper;
    @Autowired
    SchemeMapper schemeMapper;
    @Autowired
    VotingMapper votingMapper ;
    public int UserCount(int SchemeId){
        UserVotingExample userVotingExample = new UserVotingExample();
        UserVotingExample.Criteria criteria = userVotingExample.createCriteria();
        criteria.andSchemeIdFkEqualTo(SchemeId);    //每个用户一定会对一个方案进行投票
        List<UserVoting> userIdList = userVotingMapper.selectByExample(userVotingExample);  //对于一个方案的投票的用户存在List里面
        return userIdList.size();  //返回List的大小即人数
    }
    public String simpleMajority(Integer meetingId,Integer votingId){

        return null;
    }


    public ArrayList<VotingResultDTO> getVotingNum(List<VoteOption> optionList, List<UserVoting> userVotingList, List<Scheme> schemeList){
        Integer count=0;
        ArrayList<VotingResultDTO> votingResultDTOArrayList = new ArrayList <VotingResultDTO>();
        for(int i=0;i<schemeList.size();i++){
            for(int j=0;j<optionList.size();j++){
                VotingResultDTO votingResultDTO = new VotingResultDTO();
                votingResultDTO.setSchemeId(schemeList.get(i).getSchemeId());
                votingResultDTO.setSchemeName(schemeList.get(i).getSchemeName());
                votingResultDTO.setOptionId(optionList.get(j).getVoteOptionId());
                votingResultDTO.setOptionName(optionList.get(j).getVoteOptionName());
                for(int k=0;k<userVotingList.size();k++){
                    if (userVotingList.get(k).getOptionIdFk()==optionList.get(j).getVoteOptionId()
                            &&userVotingList.get(k).getSchemeIdFk()==schemeList.get(i).getSchemeId()){
                        count++;
                    }
                }
                votingResultDTO.setVoteNumber(count);
                count=0;
                votingResultDTOArrayList.add(votingResultDTO);
            }
        }
        return votingResultDTOArrayList;
    }

    public ArrayList<VotingResultDTO> sortResults(ArrayList<VotingResultDTO> votingResultDTOArrayList,Integer optionId){


        ArrayList<VotingResultDTO> resultDTOS = new ArrayList <VotingResultDTO>();
        for(int i=0;i<votingResultDTOArrayList.size();i++){
            if (votingResultDTOArrayList.get(i).getOptionId()==optionId){
                resultDTOS.add(votingResultDTOArrayList.get(i));
            }
        }
        resultDTOS.sort(new Comparator <VotingResultDTO>() {
            @Override
            public int compare(VotingResultDTO o1, VotingResultDTO o2) {
                return o2.getVoteNumber()-o1.getVoteNumber();   //降序
                //return o1.getVoteNumber()-o2.getVoteNumber();   //升序
            }
        });

        return resultDTOS;

    }
    //简单多数投票结果处理
    public ArrayList<VotingResultDTO> simpleMajorityResultsDeal(ArrayList<VotingResultDTO> VL,Voting voting){
        int temp =0,selectNum=voting.getVotingSchemeNumber();
        ArrayList<VotingResultDTO> RL = new ArrayList <VotingResultDTO>();
        temp=VL.get(selectNum-1).getVoteNumber();
        //选取临界点判断
        if(VL.get(selectNum-1).getVoteNumber()==VL.get(selectNum).getVoteNumber()){
            //临界点内外得到的投票数量相同
            if (VL.get(0).getVoteNumber()==temp&&VL.get(VL.size()-1).getVoteNumber()==temp){
                //所有方案获得的票数相同，重新讨论
                return null;
            }else if (VL.get(0).getVoteNumber()!=temp){
                //需要重投，对数据进行处理
                for(int i=0;i<VL.size();i++){
                    if(VL.get(i).getVoteNumber()>temp){
                        //投票数量大于temp的写入投票结果，剩下进行重新投票
                        SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                        SchemeExample schemeExample = new SchemeExample();
                        SchemeExample.Criteria criteria = schemeExample.createCriteria();
                        criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                        scheme.setSchemeCandidateState("2");
                        schemeMapper.updateByExampleSelective(scheme,schemeExample);
                        RL.add(VL.get(i));
                    }else {
                        break;
                    }
                }
            }else if(VL.get(0).getVoteNumber()==temp&&VL.get(VL.size()-1).getVoteNumber()!=temp){
                for(int i=0;i<VL.size();i++){
                    if (VL.get(i).getVoteNumber()==temp){
                        RL.add(VL.get(i));
                    }else {
                        SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                        SchemeExample schemeExample = new SchemeExample();
                        SchemeExample.Criteria criteria = schemeExample.createCriteria();
                        criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                        scheme.setSchemeCandidateState("0");
                        schemeMapper.updateByExampleSelective(scheme,schemeExample);
                    }
                }
            }
        }else {
            for(int i=0;i<VL.size();i++){
                if(VL.get(i).getVoteNumber()>=temp){
                    //前selectNum个方案直接选取
                    SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                    SchemeExample schemeExample = new SchemeExample();
                    SchemeExample.Criteria criteria = schemeExample.createCriteria();
                    criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                    scheme.setSchemeCandidateState("2");
                    schemeMapper.updateByExampleSelective(scheme,schemeExample);
                    RL.add(VL.get(i));
                }else {
                    break;
                }
            }
        }
        //将处理完的投票结果的选出的方案数量传到数据库
        VotingExample votingExample = new VotingExample();
        VotingExample.Criteria criteria = votingExample.createCriteria();
        criteria.andVotingIdEqualTo(voting.getVotingId());
        Voting updateVoting = new Voting();
        updateVoting.setVotingResultNum(RL.size());
        votingMapper.updateByExampleSelective(updateVoting,votingExample);
        return RL;
    }
    
    //过半数投票结果处理
    public ArrayList<VotingResultDTO> moreThanHalf(ArrayList <VotingResultDTO> VL,Voting voting,Integer userNum){


        Integer halfUsers =userNum/2+userNum%2;
        Integer temp =0,selectNum=voting.getVotingSchemeNumber();
        ArrayList<VotingResultDTO> RL = new ArrayList <VotingResultDTO>();
        temp=VL.get(selectNum-1).getVoteNumber();
        //选取临界点判断
        if(VL.get(selectNum-1).getVoteNumber()==VL.get(selectNum).getVoteNumber()){
            //临界点内外得到的投票数量相同
            if (VL.get(0).getVoteNumber()==temp&&VL.get(VL.size()-1).getVoteNumber()==temp){
                //所有方案获得的票数相同，重新讨论
                return null;
            }else if (VL.get(0).getVoteNumber()!=temp){
                //需要重投，对数据进行处理
                for(int i=0;i<VL.size();i++){
                    if(VL.get(i).getVoteNumber()>temp&&VL.get(i).getVoteNumber()>=halfUsers){
                        //投票数量大于temp的写入投票结果，剩下进行重新投票
                        SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                        SchemeExample schemeExample = new SchemeExample();
                        SchemeExample.Criteria criteria = schemeExample.createCriteria();
                        criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                        scheme.setSchemeCandidateState("2");
                        schemeMapper.updateByExampleSelective(scheme,schemeExample);
                        RL.add(VL.get(i));
                    }else {
                        break;
                    }
                }
            }else if(VL.get(0).getVoteNumber()==temp&&VL.get(VL.size()-1).getVoteNumber()!=temp){
                for(int i=0;i<VL.size();i++){
                    if (VL.get(i).getVoteNumber()==temp){
               //         RL.add(VL.get(i));
                    }else {
                        SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                        SchemeExample schemeExample = new SchemeExample();
                        SchemeExample.Criteria criteria = schemeExample.createCriteria();
                        criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                        scheme.setSchemeCandidateState("0");
                        schemeMapper.updateByExampleSelective(scheme,schemeExample);
                    }
                }
            }
        }else {
            for(int i=0;i<VL.size();i++){
                if(VL.get(i).getVoteNumber()>=temp&&VL.get(i).getVoteNumber()>=halfUsers){
                    //前selectNum个方案直接选取
                    SchemeWithBLOBs scheme = new SchemeWithBLOBs();
                    SchemeExample schemeExample = new SchemeExample();
                    SchemeExample.Criteria criteria = schemeExample.createCriteria();
                    criteria.andSchemeIdEqualTo(VL.get(i).getSchemeId());
                    scheme.setSchemeCandidateState("2");
                    schemeMapper.updateByExampleSelective(scheme,schemeExample);
                    RL.add(VL.get(i));
                }else {
                    break;
                }
            }
        }
        //将处理完的投票结果的选出的方案数量传到数据库
        VotingExample votingExample = new VotingExample();
        VotingExample.Criteria criteria = votingExample.createCriteria();
        criteria.andVotingIdEqualTo(voting.getVotingId());
        Voting updateVoting = new Voting();
        updateVoting.setVotingResultNum(RL.size());
        votingMapper.updateByExampleSelective(updateVoting,votingExample);
        return RL;
    }


    public Boolean judgeIfNeedToVoteAgain(Integer votingId){

        Voting voting = votingMapper.selectByPrimaryKey(votingId);
        Integer judge =voting.getVotingSchemeNumber()-voting.getVotingResultNum();
        if (judge==0){
            return true;
        }else {
            //投票轮次进行更新
            VotingExample votingExample = new VotingExample();
            VotingExample.Criteria criteria = votingExample.createCriteria();
            criteria.andVotingIdEqualTo(voting.getVotingId());
            Voting updateVoting = new Voting();
            updateVoting.setVotingCurrentRound(voting.getVotingCurrentRound()+1);
            votingMapper.updateByExampleSelective(updateVoting,votingExample);
            return false;
        }

    }



}
