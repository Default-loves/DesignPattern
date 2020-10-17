package com.junyi.State.example2.good;

import com.junyi.State.example2.ISwitchState;
import com.junyi.State.example2.IUser;

/**
 * @time: 2020/10/15 10:35
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class User implements IUser, ISwitchState {

    private IUser user;

    public User() {
        this.user = new Normal();
    }

    public User(IUser user) {
        this.user = user;
    }

    @Override
    public void purchasePlus() {
        user = new Plus();
    }

    @Override
    public void expire() {
        user = new Normal();
    }

    @Override
    public void buyGood() {
        user.buyGood();
    }
}
