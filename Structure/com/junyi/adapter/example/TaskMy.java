package com.junyi.adapter.example;

import java.util.concurrent.Callable;

/**
 * @time: 2020/9/10 12:09
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class TaskMy implements Callable<Long> {
    private long num;

    public TaskMy(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= this.num; n++) {
            r = r + n;
        }
        System.out.println("Result: " + r);
        return r;
    }
}
