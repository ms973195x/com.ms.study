package com.ms.study.demo;


import org.junit.Test;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/6/26
 * @description: Java 面向对象多态练习
 */
public class PolymDemo {

    /**
     * 多态存在的三个必要条件
     *
     * 一、要有继承；
     *
     * 二、要有重写；
     *
     * 三、父类引用指向子类对象。
     *
     * 多态的好处：
     *
     * 1、可替换性（substitutability）。多态对已存在代码具有可替换性。例如，多态对圆Circle类工作，对其他任何圆形几何体，如圆环，也同样工作。
     *
     * 2、可扩充性（extensibility）。多态对代码具有可扩充性。增加新的子类不影响已存在类的多态性、继承性，以及其他特性的运行和操作。实际上新加子类更容易获得多态功能。
     * 例如，在实现了圆锥、半圆锥以及半球体的多态基础上，很容易增添球体类的多态性。
     *
     * 3、接口性（interface-ability）。多态是超类通过方法签名，向子类提供了一个共同接口，由子类来完善或者覆盖它而实现的。
     *
     * 4、灵活性（flexibility）。它在应用中体现了灵活多样的操作，提高了使用效率。
     *
     * 5、简化性（simplicity）。多态简化对应用软件的代码编写和修改过程，尤其在处理大量对象的运算和操作时，这个特点尤为突出和重要。
     *
     * Java中多态的实现方式：接口实现，继承父类进行方法重写，同一个类中进行方法重载。
     */

    /**
     * 1.子类重写、重载父类方法
     * 2.类自己重载自己方法
     *
     * 主要完成一个方法完成不同的事情
     */


    @Test
    public void Test(){
        Animal a = new Cat();
        a.sing();
        /**
         * 调用子类新方法，可以换种写法
         * Cat c = (Cat) a;
         * c.eat();
         */
        ((Cat) a).eat();

        Animal a1 = new Dog();
        ((Dog) a1).sing("调用子类重载方法");
        a1.sing();

        Dog dog = new Dog();
        dog.sing();
        dog.sing("自己重载");
    }

}


// 父类动物
class Animal {
    public void sing() {
        System.out.println("Animal is singing!");
    }
}

// 子类狗
class Dog extends Animal {
    @Override
    public void sing() {
        System.out.println("Dog is singing!");
    }
    public void sing(String a){
        System.out.println(a);
    }
}

// 子类猫
class Cat extends Animal {
    @Override
    public void sing() {
        System.out.println("Cat is singing!");
    }

    public void eat() {
        System.out.println("Cat is eating!");
    }
}
