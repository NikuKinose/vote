package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.MaterialMapper;
import ssm.pojo.Material;
import ssm.pojo.MaterialExample;
import ssm.service.MaterialService;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialMapper materialMapper;


    @Override
    public void addMaterial(Material material) {
            materialMapper.insert(material);
    }

    @Override
    public List<Material> findMaterial() {
        MaterialExample materialExample = new MaterialExample();
        return materialMapper.selectByExample(materialExample);
    }

    @Override
    public Material findMaterialById(Integer materialId) {

        return materialMapper.selectByPrimaryKey(materialId);
    }
}
