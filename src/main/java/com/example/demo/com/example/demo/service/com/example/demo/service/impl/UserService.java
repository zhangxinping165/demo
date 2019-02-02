package com.example.demo.com.example.demo.service.com.example.demo.service.impl;

import com.example.demo.com.example.demo.service.IUserService;
import com.example.demo.dao.UserDao;
import com.example.demo.dos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
