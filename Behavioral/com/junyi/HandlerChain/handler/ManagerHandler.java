package com.junyi.HandlerChain.handler;


import com.junyi.HandlerChain.Request;

import java.math.BigDecimal;

/**
 * @time: 2020/9/10 11:14
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class ManagerHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        // 如果超过1000元，处理不了，交下一个处理:
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;
        }
        // 对Bob有偏见:
        return !request.getName().equalsIgnoreCase("bob");
    }
}