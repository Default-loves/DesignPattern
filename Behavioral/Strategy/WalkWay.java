package Strategy;


// 鸭子有两种行走方式，一种是直走，一种是随机走，可以在client中根据需要调用不同的方式
public interface WalkWay {
    void walk();
}

