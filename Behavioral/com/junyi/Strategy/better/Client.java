package com.junyi.Strategy.better;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description: 策略模式与工厂模式结合
 */
public class Client {
    private static void main(String[] argv) {
        Duck duck = new Duck(WalkStrategy.GO_STRAIGHT);
        duck.go();
        duck.setWalkWay(WalkStrategy.GO_RANDOM);
        duck.go();
    }
}
