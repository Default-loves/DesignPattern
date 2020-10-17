package com.junyi.State.example2.good;

import com.junyi.State.example2.IUser;

/**
 * @time: 2020/10/15 10:21
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Normal implements IUser {
    @Override
    public void buyGood() {
        System.out.println("Invoke Normal service");
    }
}
