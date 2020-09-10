package AbstractFactory;

/**
 * @time: 2020/9/10 11:52
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
