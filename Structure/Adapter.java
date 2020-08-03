package com.junyi.java.Structure;

/*
适配器
把一个类接口转换成用户需要的另一个接口
 */

public class Adapter {}


public class Task implements Callable<Long> {
    private long num;
    public Task(long num) {
        this.num = num;
    }

    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= this.num; n++) {
            r = r + n;
        }
        System.out.println("Result: " + r);
        return r;
    }
}

public class RunnableAdapter implements Runnable {
    // 引用待转换接口:
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    // 实现指定接口:
    public void run() {
        // 将指定接口调用委托给转换接口调用:
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Client {
    public static void main(String[] args) {
        // 架设：Thread只接受Runnable接口，这儿我们传入Callable接口会报错
        Callable<Long> callable = new Task(123450000L);
        Thread thread = new Thread(callable); // compile error!
        thread.start();

        // 为此我们可以定义一个适配器Adapter，将Callable接口转变为Runable接口
        Callable<Long> callable = new Task(123450000L);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}