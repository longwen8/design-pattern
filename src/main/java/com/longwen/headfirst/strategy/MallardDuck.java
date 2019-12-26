package com.longwen.headfirst.strategy;

/**
 * 绿头鸭呱呱叫和会飞
 * Created by huangxinping on 19/12/5.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){

         quackBehavior = new Quack();
         flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
