package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public class Espresson extends Beverage {

    public Espresson() {
        descripttion = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
