package HandlerChain;

import java.math.BigDecimal;

/**
 * @time: 2020/9/10 11:13
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
