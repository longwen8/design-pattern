package com.longwen.headfirst.strategy;

/**
 * Created by huangxinping on 19/12/5.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        /**
         * 封装飞行行为 和 封装呱呱叫行为 作为一族算法，是一组行为，这些行为是可以互换的
         *
         * 设计原则  多用组合、少用继承。
         */
    }
}
