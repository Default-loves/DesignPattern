package cn.junyi;

/**
 * User: JY
 * Date: 2019/4/7 0007
 * Description: 单例模式
 */

//懒汉式-线程不安全
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//饿汉式-线程安全，将instance提前实例化，丢失了延迟实例化带来的节约资源的好处
//public class Singleton {
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

//懒汉式-线程安全，将方法加锁，会让线程阻塞时间过长，存在性能问题
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){}
//    public static synchronized Singleton getInstance() {
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//双重校验锁-线程安全
//public class Singleton {
//    private volatile static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        if (instance == null){
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}

//静态内部类实现，具有延迟初始化的好处，也有JVM保证了线程安全
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
