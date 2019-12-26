package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.descripttion = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
