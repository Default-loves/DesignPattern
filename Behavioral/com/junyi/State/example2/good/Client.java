package com.junyi.State.example2.good;

import org.junit.jupiter.api.Test;

/**
 * @time: 2020/10/15 10:49
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {

    @Test
    public void test() {
        // 用户初始状态为普通用户
        User user = new User();

        user.buyGood();

        // 用户购买 Plus 会员，状态改变
        user.purchasePlus();

        user.buyGood();

        // Plus 会员过期，变成普通用户，状态改变
        user.expire();

        user.buyGood();
    }
}
