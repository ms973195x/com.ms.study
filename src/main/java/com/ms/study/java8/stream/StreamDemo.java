package com.ms.study.java8.stream;


import com.ms.study.java8.stream.entity.Dish;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/7/10
 * @description: java8 Stream流 示例练习
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        // Stream<Dish> dishStream = menu.stream();

        // 用stream过滤卡路里大于400的，然后按照卡路里进行排序，再到控制台打印完成之后的信息 TODO 使用java8 stream 提供的指令式编程
        menu.stream().filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map((dish -> "菜品名称" + dish.getName() + " 卡路里" + dish.getCalories()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // dishStream.forEach(System.out::println);
        // dishStream.forEach(System.out::println) TODO stream 流只能消费一次 ;


        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        /**
         * 用stream 过滤numbers 集合
         * TODO filter() 过滤
         * TODO distinct() 去重
         * TODO limit() 返回数量
         * TODO skip() 跳过前几个元素
         */
        /*numbers.stream().filter(num -> num % 2 == 0)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);*/

        // 每个菜的名称有多长
        /*menu.stream().map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        // 菜品分组
        Map<Dish.Type, List<Dish>> collect = menu.parallelStream().collect(Collectors.groupingBy(Dish::getType));
        collect.forEach((cc,map) -> {
            System.out.println("菜品类型: " + cc);
            map.forEach(System.out::println);
        });


    }

}
