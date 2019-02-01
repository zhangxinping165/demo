package com.example.demo;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            return;
           // int a = 1/0;

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally中的方法");
        }
        System.out.println("异常之后的语句被执行了");

    }


}
