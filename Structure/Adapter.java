package com.junyi.java.Structure;

/*
适配器
把一个类接口转换成用户需要的另一个接口
 */

public class Adapter {}



public interface Duck {
    void duckSpeak();
}
public interface Chicken {
    void chickenSpeak();
}

public class WhiteDuck implements Duck{

    @Override
    public void duckSpeak() {
        System.out.println("Duck bi bi");
    }
}

public class DuckAdapter implements Chicken {
    private Duck duck;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void chickenSpeak() {
        duck.duckSpeak();
    }
}

public class Client {
    public static void main(String[] args) {
        Duck duck = new WhiteDuck();
        Chicken chicken = new DuckAdapter(duck);
        chicken.chickenSpeak();
    }
}