package com.junyi.State.example;

/**
 * 状态模式
 * 允许对象在内部状态改变的时候改变行为，仿佛对象变成了另外一个类
 * 存在状态之间的转换，要根据状态转移图来实现代码逻辑
 */

// 糖果销售机有多种状态，每种状态下销售机有不同的行为，状态可以发生转移，使得销售机的行为也发生改变。
public interface State {
    /**
     * 投入 25 分钱
     */
    void insertQuarter();

    /**
     * 退回 25 分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
