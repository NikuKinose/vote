package ssm.service;

import ssm.pojo.User;

import javax.servlet.http.HttpSession;

public interface LoginService {
    public  Boolean login(User user, HttpSession session);
}
