package com.ms.demo;


import org.junit.Test;

import java.util.Random;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/6/27
 * @description: Random随机数练习
 */
public class RanDomDemo {

    @Test
    public void Test(){
        Random random = new Random();
        // 生成随机小数
        double v = random.nextDouble();
        System.out.println(v);

    }

}

