package HandlerChain;

import HandlerChain.handler.CEOHandler;
import HandlerChain.handler.DirectorHandler;
import HandlerChain.handler.ManagerHandler;

import java.math.BigDecimal;

/**
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
