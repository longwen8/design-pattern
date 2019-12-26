package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
