package com.ms.demo;


import org.junit.Test;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/6/26
 * @description: Java 封装概念练习
 */
public class PackageDemo {

    /**
     * 封装(encapsulation)是计算机常见的术语，即保留有限的外部接口(interface)，隐藏具体实施细节。比如在Linux架构，就可以看到Linux操作系统封装了底层硬件的具体细节，
     * 只保留了系统调用这一套接口。用户处在封装的外部，只能通过接口，进行所需的操作。
     *
     * 对象(object)指代某一事物，类(class)指代象的类型。对象可以有状态和动作，即数据成员和方法。在对象内部，我们利用this来调用对象的数据成员和方法。
     * 在对象外部，比如当我们在另一个类中调用对象的时，可以使用 对象.数据成员 和 对象.方法() 来调用对象的数据成员和方法。
     *
     * 我们将要封装(encapsulation)对象的成员(成员包括数据成员和方法)，从而只允许从外部调用部分的成员。利用封装，我们可以提高对象的易用性和安全性。
     *
     * 对象成员的封装
     *
     * 通过三个关键字来控制对象的成员的外部可见性(visibility): public, private, protected。
     * public: 该成员外部可见，即该成员为接口的一部分
     * private: 该成员外部不可见，只能用于内部使用，无法从外部访问。
     */

    @Test
    public void Test(){

    }
}
