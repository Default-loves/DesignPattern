package SimpleFactory;

/**
 * @time: 2020/9/10 12:08
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class SimpleFactory {
    public FactoryMethod.Product createProduct(int type) {
        if (type == 1)
            return new FactoryMethod.ConcreProduct1();
        if (type == 2)
            return new FactoryMethod.ConcreProduct2();
        else
            return new FactoryMethod.ConcreProduct3();
    }
}
