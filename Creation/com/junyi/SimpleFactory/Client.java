package com.junyi.SimpleFactory;

/**
 * @time: 2020/9/10 12:08
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        Product p = sf.createProduct(2);
        // do something with product
    }
}
