package Template;

/**
 * @time: 2020/9/10 11:47
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Coffe extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("coffe brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffe add condiments");
    }
}
