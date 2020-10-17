package com.junyi.FactoryMethod;

/**
 * @time: 2020/9/10 12:07
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        FactoryMy factory = new ConcreFactory1();
        factory.dosomething();
    }
}
