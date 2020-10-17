package com.junyi.Singleton;

/*
懒汉式，线程安全
instance = new Singleton()这句话会执行三件事：
1. 为instance分配内存空间；
2. 初始化instance
3. 将instanace指向分配的内存地址
但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
例如，线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
* */
class Singleton2 {
    private static volatile Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) { //双重检验，这一个if用来防止有两个或者多个线程同时进入，如果没有if的话，会有两个或者多个实例
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}


