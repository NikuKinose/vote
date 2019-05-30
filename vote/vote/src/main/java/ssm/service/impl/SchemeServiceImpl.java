package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.SchemeMapper;
import ssm.pojo.Scheme;
import ssm.pojo.SchemeExample;
import ssm.pojo.SchemeWithBLOBs;
import ssm.service.SchemeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchemeServiceImpl implements SchemeService {
    @Autowired
    SchemeMapper schemeMapper;

    public String addScheme(SchemeWithBLOBs scheme){

        int if_ok = 0;
        if_ok = schemeMapper.insert(scheme);
        if (if_ok>0){
            return "OK";
        }
        else{
            return "FALSE";
        }
    }

    public Scheme selectSchemeById(int schemeId){
        SchemeExample schemeExample = new SchemeExample();
        SchemeExample.Criteria criteria = schemeExample.createCriteria();
        criteria.andSchemeIdEqualTo(schemeId);
        List<Scheme> schemeList =  schemeMapper.selectByExample(schemeExample);
        return schemeList.get(0);

    }
    public List<Scheme> selectSchemeByMeetingId(int meetingId,String candidateState){
        SchemeExample schemeExample = new SchemeExample();
        SchemeExample.Criteria criteria = schemeExample.createCriteria();
        criteria.andSchemeMeetingIdFkEqualTo(meetingId);
        if (candidateState =="1"){
            criteria.andSchemeCandidateStateEqualTo(candidateState);
        }else if (candidateState =="0") {
            criteria.andSchemeCandidateStateEqualTo(candidateState);
        }else if(candidateState =="2"){
            ArrayList<String> arrayList =new ArrayList <String>();
            arrayList.add("1");
            arrayList.add("2");
            criteria.andSchemeCandidateStateIn(arrayList);
        }
        List<Scheme> schemeList =  schemeMapper.selectByExample(schemeExample);
        return schemeList;
    }



    public int updateSchemeCandidateState(Scheme scheme,String state){
        SchemeExample schemeExample = new SchemeExample();
        SchemeExample.Criteria criteria = schemeExample.createCriteria();
        criteria.andSchemeIdEqualTo(scheme.getSchemeId());
        List<Scheme> schemeList =  schemeMapper.selectByExample(schemeExample);
        schemeList.get(0).setSchemeCandidateState(state);
        if(schemeMapper.updateByPrimaryKey(schemeList.get(0))!=0){
            return schemeList.get(0).getSchemeMeetingIdFk();
        }else {
            return 0;
        }
    }

}
