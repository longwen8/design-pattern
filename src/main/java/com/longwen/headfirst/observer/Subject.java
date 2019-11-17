package com.longwen.headfirst.observer;

/**
 * Created by huangxinping on 19/11/17.
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer
     */
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();


}
