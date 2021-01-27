package com.junyi.adapter.example2;

/**
 * @time: 2021/1/25 14:27
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Adapter {

    public int conver(int volt) {
        System.out.println("将 220V 变为 5V");
        return volt - 215;
    }
}
