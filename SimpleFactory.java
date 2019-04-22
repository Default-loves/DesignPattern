package cn.junyi;

import java.security.ProtectionDomain;
import java.text.SimpleDateFormat;

/**
 * User: JY
 * Date: 2019/4/7 0007
 * Description: 简单工厂
 */

/*
public interface Product{}
public class ConcreProduct implements Product {}
public class ConcreProduct1 implements Product {}
public class ConcreProduct2 implements Product {}

public class SimpleFactory {

    public Product getProduct(Integer type) {
        if (type == 1) {
            return new ConcreProduct1();
        } else if (type == 2) {
            return new ConcreProduct2();
        } else {
            return new ConcreProduct();
        }
    }
}

public class client {
    public static void main(String[] argv) {
        SimpleFactory sf = new SimpleFactory();
        Product p = sf.getProduct(1);
        //do something with p
    }
}
*/