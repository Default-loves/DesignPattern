package HandlerChain.handler;

import HandlerChain.Request;

import java.math.BigDecimal;

/**
 * @time: 2020/9/10 11:18
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过10000元，处理不了，交下一个处理:
        if (request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0) {
            return null;
        }
        return Boolean.TRUE;
    }
}
