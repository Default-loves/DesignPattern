package com.junyi.adapter.example2;

import org.junit.jupiter.api.Test;

/**
 * @time: 2021/1/25 14:27
 * @version: 1.0
 * @author: junyi Xu
 * @description: 适配器的例子：家庭电源 HomeBattery 能够提供220V的电压，但是给手机充电线 USBLine 使用的线输入是5V，如果没有适配器将电压改变，会产生错误
 * 但适配器模式并不推荐多用。因为未雨绸缪好过亡羊补牢，如果事先能预防接口不同的问题，不匹配问题就不会发生，只有遇到源接口无法改变时，才应该考虑使用适配器。
 */
public class Client {

    @Test
    public void chargePhone() {
        // 家庭电源提供 220V 的电压
        HomeBattery homeBattery = new HomeBattery();
        int supplyVolt = homeBattery.supply();

        // 添加设配器，才能够正常运行
        Adapter adapter = new Adapter();
        supplyVolt = adapter.conver(supplyVolt);

        // 使用USB线给手机充电
        USBLine usbLine = new USBLine();
        usbLine.charge(supplyVolt);
    }
}
