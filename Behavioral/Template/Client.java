package Template;

/*
模板方法
定义算法框架，但是某些方法延迟到子类去实现
子类需要实现具体的某些步骤，执行还是按照算法框架的流程
 */
/**
 * @time: 2020/9/10 11:47
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
