package com.junyi.decorator;


public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}


