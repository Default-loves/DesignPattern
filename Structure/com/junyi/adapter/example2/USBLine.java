package com.junyi.adapter.example2;

/**
 * @time: 2021/1/25 14:27
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class USBLine {

    public void charge(int volt) {
        if (volt != 5) {
            throw new IllegalArgumentException("只能接收5V的电压");
        }
        System.out.println("正常充电");
    }
}
