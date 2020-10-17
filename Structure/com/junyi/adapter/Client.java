package com.junyi.adapter;

import java.util.concurrent.Callable;
/*
适配器
把一个类接口转换成用户需要的另一个接口
 */
/**
 * @time: 2020/9/10 12:09
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        wrong();
        right();
    }

    private static void wrong() {
        Callable<Long> callable = new TaskMy(123450000L);
        // 假设：Thread只接受Runnable接口，这儿我们传入Callable接口会报错
//        Thread thread = new Thread(callable); // compile error!
//        thread.start();
    }

    private static void right() {
        // 为此我们可以定义一个适配器Adapter，将Callable接口转变为Runable接口
        Callable<Long> callable = new TaskMy(123450000L);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}
