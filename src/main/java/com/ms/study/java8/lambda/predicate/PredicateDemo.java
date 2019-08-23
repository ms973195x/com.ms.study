package com.ms.study.java8.lambda.predicate;


import com.ms.study.java8.parameterization.entity.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class PredicateDemo {

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


        /**
         * predicate 接口定义了一个名叫 test 的抽象方法，它接受泛型T 对象，并返回一个 boolean
         * 用Lambda表达式可用(T t) -> t.xxx > xxx  直接做判断
         */
        List<Apple> filter = filter(apples, (Apple apple) -> apple.getWeight() > 150);

        filter.forEach(apple -> System.out.println(apple.getColor() + "  " + apple.getWeight()));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }

}
