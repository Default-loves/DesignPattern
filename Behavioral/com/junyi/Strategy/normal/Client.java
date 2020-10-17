package com.junyi.Strategy.normal;

import com.junyi.Strategy.GoRandom;
import com.junyi.Strategy.GoStraight;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description: 策略模式，定义实现了一系列的算法，client可以根据需要自由替换不同算法
 *  弊端：setWalkWay()中，每 new 一个对象，相当于调用者多知道了一个类，增加了类与类之间的联系，不利于程序的松耦合。
 *  更好的做法是与工厂模式结合
 */
public class Client {
    private static void main(String[] argv) {
        Duck duck = new Duck();
        duck.setWalkWay(new GoRandom());
        duck.go();
        duck.setWalkWay(new GoStraight());
        duck.go();
    }
}
