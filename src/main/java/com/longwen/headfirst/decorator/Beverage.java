package com.longwen.headfirst.decorator;

/**
 * Created by huangxinping on 19/12/12.
 */
public abstract class Beverage
{
    String descripttion = "Unknown Beverage";

    public String getDescription() {
        return descripttion;
    }

    public abstract double cost();
}
