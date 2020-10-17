package com.junyi.Strategy;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class GoStraight implements WalkWay {
    @Override
    public void walk() {
        System.out.println("Go straight");
    }
}
