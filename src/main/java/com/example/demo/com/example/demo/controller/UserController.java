package com.example.demo.com.example.demo.controller;

import com.example.demo.com.example.demo.service.com.example.demo.service.impl.UserService;
import com.example.demo.dos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/userInsert")
    public String insert(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        userService.insert(user);
        return user.toString();
    }

}
