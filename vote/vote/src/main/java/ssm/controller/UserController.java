package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.User;
import ssm.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController{

        @Autowired
        UserService userService;

        @RequestMapping("selectUser.action")
        public String selectUser(User user, Model model){ //model模型
            List<User> userList = userService.selectUser(user);

            model.addAttribute("userResult", userList);
            return "index";
        }

        @RequestMapping("addUser.action")
        public  String addUser(User register){
            String if_ok = userService.addUser(register);
            if (if_ok == "OK"){
                return "success";
            }else {
                return "error";
            }
        }
    }



