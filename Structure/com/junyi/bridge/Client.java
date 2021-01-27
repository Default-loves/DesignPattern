package com.junyi.bridge;

import com.junyi.bridge.color.Blue;
import com.junyi.bridge.color.Green;
import com.junyi.bridge.color.Red;
import com.junyi.bridge.shape.Rectangle;
import com.junyi.bridge.shape.Round;
import com.junyi.bridge.shape.Triangle;
import org.junit.jupiter.api.Test;

/**
 * @time: 2021/1/25 16:02
 * @version: 1.0
 * @author: junyi Xu
 * @description: 桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 这个说法很晦涩，不如直接看代码
 * 形状和颜色是同级的特征，不存在继承等关系，桥接模式就是将同等级的接口进行组合
 * 其实本质上就是接口分离，如果A需要用到B，就在A中添加局部变量，通过构造器/setter注入B
 */
public class Client {

    @Test
    public void drawTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new Red());
        rectangle.draw();

        Round round = new Round();
        round.setColor(new Blue());
        round.draw();

        Triangle triangle = new Triangle();
        triangle.setColor(new Green());
        triangle.draw();
    }
}
