package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class TextController {
    @RequestMapping("text.action")
    public String Text(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inst[] = request.getParameterValues("name");
        for(int i=0;i<=3;i++) {
            System.out.println("000000000000"+inst[i]+"-------");
        }
        return "success";
    }
    @RequestMapping("test.action")
    public String Test(HttpSession session)throws Exception{
        ArrayList<Integer> arrayList = new ArrayList <>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(9);
        for(int i =0;i<10;i++){
            System.out.println(arrayList.get(i));
        }

        return "success";
    }

}
