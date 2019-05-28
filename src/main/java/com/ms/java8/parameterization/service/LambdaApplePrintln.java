package com.ms.java8.parameterization.service;


import com.ms.java8.parameterization.entity.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class LambdaApplePrintln {

    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.setColor("蓝色");
        a1.setWeight(150.11);

        Apple a2 = new Apple();
        a2.setColor("红色");
        a2.setWeight(140.22);

        List<Apple> apples = new ArrayList<>();
        apples.add(a1);
        apples.add(a2);

        apples.sort((Apple aa1,Apple aa2) -> aa1.getWeight().compareTo(aa2.getWeight()));

    }


}
