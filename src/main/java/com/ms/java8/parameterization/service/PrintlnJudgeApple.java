package com.ms.java8.parameterization.service;


import com.ms.java8.parameterization.entity.Apple;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class PrintlnJudgeApple implements AppleWeightPrintln {

    public String applePrintln(Apple apple) {
        String str = apple.getWeight() > 150 ? apple.getColor() + " " + apple.getWeight() + "  重" : apple.getColor() + " " + apple.getWeight() + "  轻";
        return str;
    }

}
