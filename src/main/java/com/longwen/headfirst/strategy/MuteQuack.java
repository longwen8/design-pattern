package com.longwen.headfirst.strategy;

/**
 * Created by huangxinping on 19/12/5.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }


}
