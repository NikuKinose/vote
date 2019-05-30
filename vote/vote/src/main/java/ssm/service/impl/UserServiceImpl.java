package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.UserMapper;
import ssm.mapper.UserVotingMapper;
import ssm.pojo.User;
import ssm.pojo.UserExample;
import ssm.service.UserService;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectUser(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        List<User> userList =  userMapper.selectByExample(userExample);
        return userList;
    }

    @Override
    public String addUser(User user) {
        int if_ok = 0;
        if_ok = userMapper.insert(user);
        if (if_ok>0){
            return "OK";
        }
        else{
            return "FALSE";
        }

    }

    @Override
    public User selectUserById(int userId) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<User> userList =  userMapper.selectByExample(userExample);
        return userList.get(0);
    }

    public List<User> selectUserByVotingId(Integer votingId){
        System.out.println("111111111111111111111111111111111");
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserSexEqualTo("男");
        List<User> users = userMapper.selectUsersIdByVotingId(votingId);
        for(int i=0;i<users.size();i++){
            System.out.println("22222222222222222222222222"+users.get(i).getUserName());
        }


        return users;
    }
}