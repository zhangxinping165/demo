package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public String say(){

        return "Hello World";
    }

    @RequestMapping("/fish")
    public String eat(){
        return "fish";
    }
}
