package com.ms.demo;


import org.junit.Test;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/6/26
 * @description: Java 继承概念练习
 */
public class InheritDemo {
    /**
     * 在java中使用extends关键字来表示继承关系。
     * 一个类最多只能显示地继承于一个父类。但是一个类却可以被多个类继承，也就是说一个类可以拥有多个子类
     *
     * 1、子类继承父类的成员变量
     *
     * 当子类继承了某个类之后，便可以使用父类中的成员变量，但是并不是完全继承父类的所有成员变量。具体的原则如下：
     *
     * 1）能够继承父类的public和protected成员变量；不能够继承父类的private成员变量；
     *
     * 2）对于父类的包访问权限成员变量，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；
     *
     * 3）对于子类可以继承的父类成员变量，如果在子类中出现了同名称的成员变量，则会发生隐藏现象，即子类的成员变量会屏蔽掉父类的同名成员变量。
     * 如果要在子类中访问父类中同名成员变量，需要使用super关键字来进行引用。
     *
     * 2、子类继承父类的方法
     *
     * 同样地，子类也并不是完全继承父类的所有方法。
     *
     * 1）能够继承父类的public和protected成员方法；不能够继承父类的private成员方法；
     *
     * 2）对于父类的包访问权限成员方法，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；
     *
     * 3）对于子类可以继承的父类成员方法，如果在子类中出现了同名称的成员方法，则称为覆盖，即子类的成员方法会覆盖掉父类的同名成员方法。
     * 如果要在子类中访问父类中同名成员方法，需要使用super关键字来进行引用。
     *
     * 注意：隐藏和覆盖是不同的。隐藏是针对成员变量和静态方法的，而覆盖是针对普通方法的。（后面会讲到）
     *
     * 3、构造器
     *
     * 子类是不能够继承父类的构造器，但是要注意的是，如果父类的构造器都是带有参数的，则必须在子类的构造器中显示地通过super关键字调用父类的构造器并配以适当的参数列表。
     * 如果父类有无参构造器，则在子类的构造器中用super关键字调用父类构造器不是必须的，如果没有使用super关键字，系统会自动调用父类的无参构造器。
     *
     * 4、super
     * super主要有两种用法：
     *
     * 1）super.成员变量/super.成员方法;
     *
     * 2）super(parameter1,parameter2....)
     *
     * 第一种用法主要用来在子类中调用父类的同名成员变量或者方法；第二种主要用在子类的构造器中显示地调用父类的构造器，要注意的是，如果是用在子类构造器中，则必须是子类构造器的第一个语句。
     *
     */

    @Test
    public void Test(){

    }

}


class Shape {

    protected String name;

    public Shape(){
        name = "shape";
    }

    public Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

}
