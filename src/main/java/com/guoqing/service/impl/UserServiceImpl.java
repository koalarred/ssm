package com.guoqing.service.impl;

import com.guoqing.domain.User;
import com.guoqing.domain.UserExample;
import com.guoqing.mapper.UserMapper;
import com.guoqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2018/2/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserMapper userMapper;

    @Autowired
    private UserExample userExample;
    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectByExample(userExample);
    }

}
