package com.ms.java8.stream.entity;


/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/7/10
 * @description:
 */
public class Dish {
    /**
     * 菜名称
     */
    private final String name;

    /**
     * 是否是素食
     */
    private final boolean vegetarian;

    /**
     * 卡路里数
     */
    private final int calories;

    /**
     * 菜的类型
     */
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

    public enum Type {MEAT, FISH, OTHER}
}
