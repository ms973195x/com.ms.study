package com.ms.demo;


import org.junit.Test;

/**
 * @version 1.0.0
 * @author  : Created by zyl on 2019/7/24
 * @description: java基础练习Demo
 */
public class BasicsDemo {

    @Test
    public void Test() {
        Manager manager = new Manager("张三", 1100.0, 150.0);
        System.out.println(manager.toString());
    }
}


/**
 * 员工类
 */
class Employee{

    private String name;

    private Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/**
 * 经理类
 */
class Manager extends Employee{
    private Double bonus;

    public Manager() {
    }

    public Manager(Double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, Double salary, Double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double getSalary(){
        return this.bonus + super.getSalary();
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                "bonus=" + bonus +
                '}';
    }
}