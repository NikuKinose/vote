package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.UserMapper;
import ssm.pojo.User;
import ssm.pojo.UserExample;

import java.util.List;
public interface UserService {

    public List<User> selectUser(User user);
    public String addUser(User user);
    public User selectUserById(int userId);
    public List<User> selectUserByVotingId(Integer votingId);

}