package Strategy;

/**
 * @time: 2020/9/10 11:46
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Client {
    private static void main(String[] argv) {
        Duck duck = new Duck();
        duck.setWalkWay(new GoRandom());
        duck.go();
        duck.setWalkWay(new GoStraight());
        duck.go();
    }
}
