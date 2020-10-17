package com.junyi.State.example2;

/**
 * @time: 2020/10/15 9:47
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public interface ISwitchState {

    /**
     * 购买会员
     */
    void purchasePlus();

    /**
     * 会员到期，变为普通用户
     */
    void expire();
}
