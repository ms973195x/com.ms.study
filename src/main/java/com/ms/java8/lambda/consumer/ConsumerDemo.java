package com.ms.java8.lambda.consumer;


import com.ms.java8.parameterization.entity.Apple;

import java.util.function.Consumer;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(155.55);
        apple.setColor("红色");

        /**
         * Consumer 定义了一个名叫 accept 的抽象方法，它接受泛型 T的对象，没有返回值。
         * 你如果需要访问类型 T 的对象，并对其执行某些操作，就可以使用这个接口
         * 用Lambda表达式用 (T t) -> t.xx(可以对泛型T做任何操作)
         */
        println(apple,(Apple a) -> System.out.println(a.getColor()));

    }



    /**
     * 打印实体的值
     * @param t
     * @param c
     * @param <T>
     */
    public static <T> void println(T t, Consumer<T> c){
        c.accept(t);
    }

}
