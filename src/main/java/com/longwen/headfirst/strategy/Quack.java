package com.longwen.headfirst.strategy;

/**
 * Created by huangxinping on 19/12/5.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
