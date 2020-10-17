package com.junyi.AbstractFactory;

/**
 * @time: 2020/9/10 11:52
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Factory1();
        AbstractProductA a = abstractFactory.createProductA();
        AbstractProductB b = abstractFactory.createProductB();
        // do something with a and b

    }
}
