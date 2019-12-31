package com.junyi.java.Creation;

/*
简单工厂
在创建对象时不向客户端暴露内部细节，只是提供一个创建对象的接口，把创建对象的操作放到SimpleFactory这个类里面
 */



public interface Product{}
public class ConcreProduct1 implements Product {}
public class ConcreProduct2 implements Product {}
public class ConcreProduct3 implements Product {}




public class SimpleFactory {
    public Product createProduct(int type) {
        if (type == 1)
            return new ConcreProduct1();
        if (type == 2)
            return new ConcreProduct2();
        else
            return new ConcreProduct3();
    }
}


public class Client {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        com.junyi.java.Creation.Product p = sf.createProduct(2);
        // do something with product
    }
}