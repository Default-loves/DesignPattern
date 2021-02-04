package com.junyi.HandlerChain;


import com.junyi.HandlerChain.handler.CEOHandler;
import com.junyi.HandlerChain.handler.DirectorHandler;
import com.junyi.HandlerChain.handler.ManagerHandler;

import java.math.BigDecimal;
/**
 * 责任链，将处理请求的对象(Handler)构成一条链条，请求在链条中依次被Handler进行处理，直到其中某个对象处理成功，或者每个Handler都对请求进行处理，通常这种责任链称为拦截器(Interceptor)或者过滤器(Filter)，通常来说，我们会编写Handler进行日志处理、权限处理、访问控制等操作。
 */

/**
 * 责任链模式，能够任意添加处理器，处理每一个请求
 * Manager：只能审核1000元以下的报销；
 * Director：只能审核10000元以下的报销；
 * CEO：可以审核任意额度。
 */

/**
 * @time: 2020/9/10 11:15
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Application {
    public static void main(String[] args) {
        // 构造责任链:
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());

        // 处理请求:
        chain.process(new Request("Bob", new BigDecimal("123.45")));
        chain.process(new Request("Alice", new BigDecimal("1234.56")));
        chain.process(new Request("Bill", new BigDecimal("12345.67")));
        chain.process(new Request("John", new BigDecimal("123456.78")));
    }
}
