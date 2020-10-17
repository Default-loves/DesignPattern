package com.junyi.Strategy.normal;

import com.junyi.Strategy.WalkWay;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Duck {
    private WalkWay walkWay;

    public void setWalkWay(WalkWay ww) {
        this.walkWay = ww;
    }

    public void go() {
        System.out.println("Go go!");
        this.walkWay.walk();
    }
}
