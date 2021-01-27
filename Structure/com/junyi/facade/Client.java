package com.junyi.facade;




/**
 * 门面模式
 * 给客户端提供一个统一调用的接口facade，该接口调用了子系统的一群接口
 */
public class Client {
    private static void main(String[] argv) {
        Facade facade = new Facade();
        facade.start();
    }
}
