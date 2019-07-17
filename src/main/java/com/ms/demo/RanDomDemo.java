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
        int x = 0,y = 0;
        // 生成随机小数
        for (int i = 0; i < 100000000; i++) {
            int i1 = random.nextInt(2);
            if (i1 == 1){
                x++;
            }else {
                y++;
            }
        }
        int a = x - y;
        System.out.println(a);
    }

}

