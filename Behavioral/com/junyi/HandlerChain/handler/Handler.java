package com.junyi.HandlerChain.handler;


import com.junyi.HandlerChain.Request;

/**
 * @time: 2020/9/10 11:13
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public interface Handler {
    // 返回Boolean.TRUE = 成功
    // 返回Boolean.FALSE = 拒绝
    // 返回null = 交下一个处理
    Boolean process(Request request);
}