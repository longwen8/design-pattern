package com.longwen.headfirst.observer;

import java.util.*;

/**
 * 使用JDK 中的观察者接口
 * Created by huangxinping on 19/12/5.
 */
public class CurrentConditionsDisplayJdk implements java.util.Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplayJdk(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeaterDataJdk) {
            WeaterDataJdk weaterDataJdk = (WeaterDataJdk)obs;
            this.temperature = weaterDataJdk.getTemperature();
            this.humidity = weaterDataJdk.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
