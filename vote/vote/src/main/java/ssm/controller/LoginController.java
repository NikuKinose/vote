package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.User;
import ssm.service.LoginService;
import ssm.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("login.action")
    public String login(User user, HttpSession session){
        Boolean key = loginService.login(user,session);
        if(key == true){
            return "WEB-INF/home/menu";
        }else {
            return "error";
        }

    }

}
