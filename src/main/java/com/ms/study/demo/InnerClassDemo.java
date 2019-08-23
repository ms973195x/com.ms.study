package com.ms.study.demo;


import org.junit.Test;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/6/27
 * @description: Java 内部类学习
 */
public class InnerClassDemo implements Father,Mother {


    @Test
    public void Test(){
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        InnerClassDemo.InnerClass innerClass = innerClassDemo.new InnerClass();
        innerClassDemo.sing();
        innerClass.sing();
    }

    @Override
    public void sing() {
        System.out.println("主类测试");
    }

    class InnerClass implements Mother{
        @Override
        public void sing() {
            System.out.println("测试内部类");
        }
    }

}

interface Father {

}

interface Mother {
    void sing();
}