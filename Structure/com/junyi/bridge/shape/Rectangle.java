package com.junyi.bridge.shape;

import com.junyi.bridge.color.IColor;

/**
 * @time: 2021/1/25 16:02
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Rectangle implements IShape {

    private IColor color;

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("绘制 " + this.color.getColor() + " 正方形");
    }
}
