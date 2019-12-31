package com.junyi.java.Behavioral;

/*
模板方法
定义算法框架，但是某些方法延迟到子类去实现
子类需要实现具体的某些步骤，执行还是按照算法框架的流程
 */
public class Template {
}


//冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater() {
        System.out.println("boil water");
    }
    public void pourInCup() {
        System.out.println("pur in cup");
    }
}

public class Coffe extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("coffe brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffe add condiments");
    }
}

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea add condiments");
    }
}

public class Client {
    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}