package com.ms.java8.parameterization.entity;


/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description: 苹果实体
 */
public class Apple {

    /**
     * 颜色
     */
    private String color;

    /**
     * 重量
     */
    private Double weight;

    public Apple() {
    }

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}
