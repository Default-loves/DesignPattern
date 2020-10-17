package com.junyi.HandlerChain;


import com.junyi.HandlerChain.handler.Handler;

import java.util.ArrayList;
import java.util.List;

/**
 * @time: 2020/9/10 11:15
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class HandlerChain {
    // 持有所有Handler:
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        this.handlers.add(handler);
    }

    public boolean process(Request request) {
        // 依次调用每个Handler:
        for (Handler handler : handlers) {
            Boolean r = handler.process(request);
            if (r != null) {
                // 如果返回TRUE或FALSE，处理结束:
                System.out.println(request + " " + (r ? "Approved by " : "Denied by ") + handler.getClass().getSimpleName());
                return r;
            }
        }
        throw new RuntimeException("Could not handle request: " + request);
    }
}