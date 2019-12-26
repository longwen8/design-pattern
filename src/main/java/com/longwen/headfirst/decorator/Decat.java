package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public class Decat extends Beverage {
    public Decat() {
        this.descripttion = "Decat";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
