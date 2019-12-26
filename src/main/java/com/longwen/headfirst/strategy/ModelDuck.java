package com.longwen.headfirst.strategy;

/**
 * Created by huangxinping on 19/12/5.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();// 默认不会飞
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭子！");
    }
}
