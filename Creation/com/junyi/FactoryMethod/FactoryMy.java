package com.junyi.FactoryMethod;

/**
 * @time: 2020/9/10 12:07
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public abstract class FactoryMy {
    public abstract Product factoryMethod();

    public void dosomething() {
        Product product = factoryMethod();
        // do something with product
    }
}
