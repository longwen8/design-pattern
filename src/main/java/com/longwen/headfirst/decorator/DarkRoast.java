package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        descripttion = "DarkRoast";
    }

    public double cost() {
        return 0.3;
    }
}
