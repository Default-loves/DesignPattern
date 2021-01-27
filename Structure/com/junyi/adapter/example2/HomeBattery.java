package com.junyi.adapter.example2;

/**
 * @time: 2021/1/25 14:27
 * @version: 1.0
 * @author: junyi Xu
 * @description: 家庭电源能够提供 220V 的点
 */
public class HomeBattery {

    public int supply() {
        System.out.println("家庭电源提供 220V 的电压");
        return 220;
    }
}
