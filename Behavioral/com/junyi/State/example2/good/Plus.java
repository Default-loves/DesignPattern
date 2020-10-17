package com.junyi.State.example2.good;

import com.junyi.State.example2.IUser;

/**
 * @time: 2020/10/15 10:22
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Plus implements IUser {
    @Override
    public void buyGood() {
        System.out.println("Invoke Plus service");
    }
}
