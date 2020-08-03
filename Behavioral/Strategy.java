import sun.security.util.AuthResources_it;

/**
 * 策略模式
 * 定义实现了一系列的算法，client可以根据需要自由替换不同算法
 */
public class Strategy {
}


// 鸭子有两种行走方式，一种是直走，一种是随机走，可以在client中根据需要调用不同的方式
public interface WalkWay {
    void walk();
}
public class GoStraight implements WalkWay {
    @Override
    public void walk() {
        System.out.println("Go straight");
    }
}
public class GoRandom implements  WalkWay {
    @Override
    public void walk() {
        System.out.println("Go random");
    }
}

public class Duck {
    private WalkWay walkWay;
    public void setWalkWay(WalkWay ww) {
        this.walkWay = ww;
    }
    public void go() {
        System.out.println("Go go!");
        this.walkWay.walk();
    }
}

public class Client {
    private static void main(String[] argv) {
        Duck duck = new Duck();
        duck.setWalkWay(new GoRandom());
        duck.go();
        duck.setWalkWay(new GoStraight());
        duck.go();
    }
}