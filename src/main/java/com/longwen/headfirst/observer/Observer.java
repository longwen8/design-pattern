package com.longwen.headfirst.observer;

/**
 * Created by huangxinping on 19/11/17.
 */
public interface Observer {

    /**
     * 所有观察者都必须实现update方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
