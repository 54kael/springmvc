package com.kael.javaconfigssm.service;

import com.kael.javaconfigssm.beans.User;
import com.kael.javaconfigssm.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
