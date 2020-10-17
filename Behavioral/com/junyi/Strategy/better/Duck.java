package com.junyi.Strategy.better;

import com.junyi.Strategy.GoRandom;
import com.junyi.Strategy.GoStraight;
import com.junyi.Strategy.WalkWay;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Duck {
    private WalkWay walkWay;

    public Duck(WalkStrategy strategy) {
        setWalkWay(strategy);
    }

    public void setWalkWay(WalkStrategy strategy) {
        switch (strategy) {
            case GO_RANDOM:
                this.walkWay = new GoRandom();
                break;
            case GO_STRAIGHT:
                this.walkWay = new GoStraight();
                break;
            default: throw new IllegalArgumentException("There's no such strategy yet.");
        }
    }

    public void go() {
        System.out.println("Go go!");
        this.walkWay.walk();
    }
}
