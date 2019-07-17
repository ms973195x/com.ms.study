package com.ms.java8.parameterization.service;


import com.ms.java8.parameterization.entity.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class AppleDemo {

    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.setColor("蓝色");
        a1.setWeight(9.99);

        Apple a2 = new Apple();
        a2.setColor("红色");
        a2.setWeight(9.99);

        Apple a3 = new Apple();
        a3.setColor("白色");
        a3.setWeight(399.99);

        Apple a4 = new Apple();
        a4.setColor("青色");
        a4.setWeight(199.99);

        Apple a5 = new Apple();
        a5.setColor("黑色");
        a5.setWeight(99.99);

        List<Apple> apples = Arrays.asList(a1,a2,a3,a4,a5);

        apples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        prettyPrintApple(apples, (aa) -> aa.toString());

    }

    public static void prettyPrintApple(List<Apple> inventory, AppleWeightPrintln appleWeightPrintln) {
        for (Apple apple : inventory) {
            String output = appleWeightPrintln.applePrintln(apple);
            System.out.println(output);
        }
    }

}
