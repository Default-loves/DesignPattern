package com.junyi.java.Creation;

/*
工厂方法
定义了一个创建对象的接口，由子类来决定实例化哪个类，将实例化操作推迟到了子类

简单工厂中，创建对象的是另一个类，而在工厂方法中，创建对象的是子类
 */

public class FactoryMethod {
}





public interface Product{}
public class ConcreProduct1 implements Product{}
public class ConcreProduct2 implements Product{}
public class ConcreProduct3 implements Product{}

public abstract class Factory {
    public abstract Product factoryMethod();
    public void dosomething() {
        Product product = factoryMethod();
        // do something with product
    }
}

public class ConcreFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreProduct1();
    }
}

public class ConcreFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreProduct2();
    }
}

public class Client{
    public static void main(String[] args) {
        Factory factory = new ConcreFactory1();
        factory.dosomething();
    }
}