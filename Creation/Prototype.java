package com.junyi.java.Creation;

/*
原型模式
使用原型实例指定要创建的对象的类型，通过复制这个原型实例来创建新对象
 */

public abstract class Prototype {
    public abstract Prototype clone();
}


class ConcrePrototype extends Prototype {
    private String s;

    public ConcrePrototype(String s) {
        this.s = s;
    }
    @Override
    public Prototype clone() {
        return new ConcrePrototype(s);
    }

    @Override
    public String toString() {
        return s.toString();
    }
}

public class Client {
    public static void main(String[] args) {
       ConcrePrototype cp = new ConcrePrototype("abc");
       ConcrePrototype clone = (ConcrePrototype) cp.clone();
        System.out.println(clone.toString());
    }
}