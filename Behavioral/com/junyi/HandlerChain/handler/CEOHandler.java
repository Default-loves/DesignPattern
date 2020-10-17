package com.junyi.HandlerChain.handler;


import com.junyi.HandlerChain.Request;

/**
 * @time: 2020/9/10 11:19
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class CEOHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        return Boolean.TRUE;
    }
}
