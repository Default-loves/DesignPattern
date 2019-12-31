package com.junyi.java.Creation;

/*
抽象工厂
提供一个接口，创建相关的对象家族
工厂方法创建的是一个对象，而抽象工厂创建的是对象家族，这些对象是相关的，必须一起被创建出来
 */





public class AbstractProductA{}
public class AbstractProductB{}
public class ProductA1 extends AbstractProductA{}
public class ProductA2 extends AbstractProductA{}
public class ProductB1 extends AbstractProductB{}
public class ProductB2 extends AbstractProductB{}




public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}

public class Factory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

public class Factory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

public class Client{
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new Factory1();
        AbstractProductA a = abstractFactory.createProductA();
        AbstractProductB b = abstractFactory.createProductB();
        // do something with a and b

    }
}