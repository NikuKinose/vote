package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.UserMapper;
import ssm.pojo.User;
import ssm.pojo.UserExample;
import ssm.service.LoginService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserMapper userMapper;

    public Boolean login(User user, HttpSession session) {
        UserExample userExample = new UserExample();//任意形状的模型
        UserExample.Criteria criteria = userExample.createCriteria();//声明条件
        criteria.andUserEmailEqualTo(user.getUserEmail());
        criteria.andUserPasswordEqualTo(user.getUserPassword());

        //真正使用userExample
        List<User> userList = userMapper.selectByExample(userExample);
        //对比
        if (userList.size() != 0) {
            session.setAttribute("userIdSession",userList.get(0).getUserId());
            session.setAttribute("userSession",userList.get(0));
            return true;
        } else return false;
    }
}
