package com.junyi.adapter;

import java.util.concurrent.Callable;

/**
 * @time: 2020/9/10 12:09
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class RunnableAdapter implements Runnable {
    // 引用待转换接口:
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    // 实现指定接口:
    @Override
    public void run() {
        // 将指定接口调用委托给转换接口调用:
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
