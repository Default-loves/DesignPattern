package com.junyi.Prototype;

/**
 * @time: 2020/9/10 12:06
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        ConcrePrototype cp = new ConcrePrototype("abc");
        ConcrePrototype clone = (ConcrePrototype) cp.clone();
        System.out.println(clone.toString());
    }
}
