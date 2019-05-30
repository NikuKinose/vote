package ssm.service;

import ssm.pojo.Material;

import java.util.List;

public interface MaterialService {
    public void addMaterial(Material material);


    public List<Material> findMaterial();

    public Material findMaterialById(Integer materialId);
}
