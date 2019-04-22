package cn.junyi;

/**
 * User: JY
 * Date: 2019/4/8 0008
 * Description: 抽象工厂
 * 工厂方法创建一个对象，抽象工厂创建的是对象家族，这些对象是相关的，必须一起被创建
 */
/*

public class AbstractProductA {}
public class AbstractProductB {}
public class ConcreProductA1 extends AbstractProductA {}
public class ConcreProductA2 extends AbstractProductA {}
public class ConcreProductB1 extends AbstractProductB {}
public class ConcreProductB2 extends AbstractProductB {}

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
public class ConcreFactory1 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ConcreProductA1();
    }
    public AbstractProductB createProductB() {
        return new ConcreProductB1();
    }
}

public class ConcreFactory2 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ConcreProductA2();
    }
    public AbstractProductB createProductB() {
        return new ConcreProductB2();
    }
}

public class client {
    public static void main(String[] argv) {
        AbstractFactory cf1 = new ConcreFactory1();
        AbstractProductA pa = cf1.createProductA();
        AbstractProductB pb = cf1.createProductB();
        //do something with pa and pb
    }
}

*/