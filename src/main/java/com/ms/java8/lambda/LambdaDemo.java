package com.ms.java8.lambda;


/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/28
 * @description:
 */
public class LambdaDemo {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("111");
        runnablePrintln(runnable);
        runnablePrintln(() -> System.out.println("222"));


    }


    private static void runnablePrintln(Runnable runnable){
        runnable.run();
    }




}
