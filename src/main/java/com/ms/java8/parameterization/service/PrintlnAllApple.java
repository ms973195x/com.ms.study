package com.ms.java8.parameterization.service;


import com.ms.java8.parameterization.entity.Apple;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class PrintlnAllApple implements AppleWeightPrintln {

    public String applePrintln(Apple apple) {
        String str = apple.getColor() + " " + apple.getWeight();
        return str;
    }

    @Override
    public String applePrintln(Object o) {
        return null;
    }
}
