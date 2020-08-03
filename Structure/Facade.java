/**
 * 门面模式
 * 给客户端提供一个统一调用的接口facade，该接口调用了子系统的一群接口
 */
public class Facade {
    private SubSystem sus = new SubSystem();
    public void start() {
        sus.turnOnTV();
        sus.setCD("hit pop");
        sus.start();
    }
}

public class SubSystem {
    public void turnOnTV() {
        System.out.println("turn on tv");
    }
    public void setCD(String cd) {
        System.out.println("set cd :" + cd);
    }
    public void start() {
        System.out.println("start!");
    }
}

public class Client {
    private static void main(String[] argv) {
        Facade facade = new Facade();
        facade.start();
    }
}
