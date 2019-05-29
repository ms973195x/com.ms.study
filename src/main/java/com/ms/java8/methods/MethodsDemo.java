package com.ms.java8.methods;


import com.ms.java8.parameterization.entity.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/29
 * @description: Java8新语法方法引用
 */
public class MethodsDemo {


    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.setColor("绿色");
        a1.setWeight(150.11);

        Apple a2 = new Apple();
        a2.setColor("红色");
        a2.setWeight(140.22);

        List<Apple> apples = new ArrayList<>();
        apples.add(a1);
        apples.add(a2);


        BiFunction<String,Double,Apple> biFunction = Apple::new;

        Apple a = biFunction.apply("红", 121.1);


        Predicate<Apple> redApple = (apple) -> apple.getColor().equals("红色");
        Predicate<Apple> and = redApple.and((apple -> apple.getWeight() > 145)).or((apple -> apple.getColor().equals("绿色")));

        boolean test = and.test(a2);

        System.out.println(test);
    }


}
