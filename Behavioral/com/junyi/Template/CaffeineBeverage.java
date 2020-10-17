package com.junyi.Template;

/**
 * @time: 2020/9/10 11:47
 * @version: 1.0
 * @author: junyi Xu
 * @description: 冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。
 * 其中 final 方法子类不需要修改也不能修改，为固定的，而 abstract方法需要子类实现，为自定义
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("boil water");
    }

    final void pourInCup() {
        System.out.println("pur in cup");
    }
}
