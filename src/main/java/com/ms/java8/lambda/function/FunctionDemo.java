package com.ms.java8.lambda.function;


import com.ms.java8.parameterization.entity.Apple;

import java.util.function.Function;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class FunctionDemo {


    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(155.55);
        apple.setColor("红色");

        Apple apple2 = new Apple();
        apple2.setWeight(166.6);
        apple2.setColor("蓝");

        /**
         * Function<T, R> 接口定义了一个叫作 apply 的方法，它接受一个泛型 T 的对象，并返回一个泛型 R 的对象
         * Lambda表达式用 (T t) -> 返回一个随意的对象
         */
        String transition = transition(apple, (Apple apple1) -> apple1.toString());
        System.out.println(transition);

    }


    public static <T,R> R transition(T t, Function<T, R> f){
        return f.apply(t);
    }

}
