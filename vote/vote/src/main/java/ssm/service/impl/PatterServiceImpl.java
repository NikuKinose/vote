package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.PatterMapper;
import ssm.pojo.Patter;
import ssm.pojo.PatterExample;
import ssm.service.PatterService;

import java.util.List;

@Service
public class PatterServiceImpl implements PatterService {

    @Autowired
    PatterMapper patterMapper;

    @Override
    public List<Patter> selectAllPatter()  {

        PatterExample patterExample = new PatterExample();
        return patterMapper.selectByExample(patterExample);

    }


    public List<Patter> selectPatter(Patter patter) {
        PatterExample patterExample = new PatterExample();
        PatterExample.Criteria criteria = patterExample.createCriteria();
        criteria.andPatterNameEqualTo(patter.getPatterName());

        List <Patter> patterList = patterMapper.selectByExample(patterExample);
        return patterList;
    }
}
