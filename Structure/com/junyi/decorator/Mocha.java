package com.junyi.decorator;


public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}


