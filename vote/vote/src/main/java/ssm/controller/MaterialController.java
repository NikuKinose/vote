package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import ssm.pojo.Material;
import ssm.service.MaterialService;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class MaterialController {
    @Autowired
    MaterialService materialService;

    @RequestMapping("turnToAddMaterial.action")
    public String turnToAddMaterial(){return "WEB-INF/notuse/material"; }

    @RequestMapping("addMaterial.action")
    public String addMaterial(MultipartFile pic,Material material) throws IOException, ParseException {
        //插入当前时间
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String nowTime = ( simpleDateFormat.format(calendar.getTime()));
        Date nowTime1 = simpleDateFormat.parse(nowTime);
        material.setCreateTime(nowTime1);

        if(pic!=null){
            /*设置文件存储物理路径*/
            String mPath="C:\\Users\\40880\\IdeaProjects\\vote\\src\\main\\webapp\\image";
            /*获取文件原始名称*/
            String originalFilename=pic.getOriginalFilename();
            //判断
            if(originalFilename!=null&&originalFilename.length()>0){
                String filename=UUID.randomUUID().toString().replace("-","")+"-"+originalFilename;
                File file=new File(mPath+filename);
                pic.transferTo(file);
                material.setMaterialPath(filename);
            }

            materialService.addMaterial(material);
        }
        return "success";
    }

    @RequestMapping("findMaterial.action")
    public String findMaterial(Model model){
        List<Material> materials = materialService.findMaterial();
        model.addAttribute("results",materials);
        return "WEB-INF/notuse/material";
    }

    @RequestMapping("findMaterialById.action")
    public String findMaterialById(Integer materialId,Model model){
        Material material = materialService.findMaterialById(materialId);
        model.addAttribute("result",material);
        if(material.getMaterialType().replaceAll(" ","").equals("jpg")||material.getMaterialType().replaceAll(" ","").equals("png")){
        return "WEB-INF/notuse/materialtwo";}
        else
            return "WEB-INF/notuse/materialone";
    }

}
