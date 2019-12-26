package com.longwen.headfirst.strategy;

/**
 * Created by huangxinping on 19/12/5.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我会飞 ! ");
    }
}
