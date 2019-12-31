package com.junyi.java.Structure;

public class Decorator {
}

/*
装饰者
所谓装饰，就是把装饰者(Milk/Mocha)套在被装饰者(CondimentDecorator)之上，从而动态扩展被装设者的功能。装饰者有自己的方法，属于装饰者自己的功能，然后调用被装饰者的方法实现，从而保留了被装饰者的功能

类应该对扩展开放，对修改关闭：也就是添加新功能不需要修改代码。饮料可以动态添加新的配料，而不需要去修改饮料的代码
 */

public interface Beverage {
    int cost();
}

public class Beverage1 implements Beverage {
    @Override
    public int cost() {
        return 1;
    }
}
public class Beverage2 implements Beverage {
    @Override
    public int cost() {
        return 2;
    }
}

public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;
}

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Beverage1();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
    }
}


