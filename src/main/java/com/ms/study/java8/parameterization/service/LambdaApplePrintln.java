package com.ms.study.java8.parameterization.service;


import com.ms.study.java8.parameterization.entity.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description: Lambda表达式应用
 */
public class LambdaApplePrintln {

    public static void main(String[] args) {
        Apple aaaa1 = new Apple();
        aaaa1.setColor("蓝色");
        aaaa1.setWeight(150.11);

        Apple aaaa2 = new Apple();
        aaaa2.setColor("红色");
        aaaa2.setWeight(140.22);

        List<Apple> apples = new ArrayList<>();
        apples.add(aaaa1);
        apples.add(aaaa2);

        apples.forEach(apple -> System.out.println(apple.getColor()));

    }


}
