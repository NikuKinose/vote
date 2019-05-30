package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Patter;
import ssm.service.PatterService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PatterController {
    @Autowired
    PatterService patterService;


    @RequestMapping("selectAllPatter.action")
    public String selectAllPatter(Model model){
        List<Patter> patterList = patterService.selectAllPatter() ;
        model.addAttribute("patterResult", patterList);
        return "index";
    }


    @RequestMapping("/patterSelect.action")
    public String selectPatter(int meetingId,HttpSession session){
        session.setAttribute("meetingId",meetingId);
        Patter patter = new Patter();
        patter.setPatterName("单选项非排序式");
        List<Patter> patterList1= patterService.selectPatter(patter) ;
        session.setAttribute("patterExplain1",patterList1.get(0).getPatterSetExplain());
       // model.addAttribute("patterExplain1", patterList1.get(0).getPatterSetExplain());
        patter.setPatterName("多选项非排序式");
        List<Patter> patterList2= patterService.selectPatter(patter) ;
       // model.addAttribute("patterExplain2", patterList2.get(0).getPatterSetExplain());
        session.setAttribute("patterExplain2",patterList2.get(0).getPatterSetExplain());
        patter.setPatterName("单选项排序式");
        List<Patter> patterList3= patterService.selectPatter(patter) ;
       // model.addAttribute("patterExplain3", patterList3.get(0).getPatterSetExplain());
        session.setAttribute("patterExplain3",patterList3.get(0).getPatterSetExplain());
        return "WEB-INF/home/patterSelect";
    }

}
