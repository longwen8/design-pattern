package com.longwen.headfirst.observer;

import java.util.Observable;

/**
 * 使用jdk内置观察者模式
 * Created by huangxinping on 19/12/5.
 */
public class WeaterDataJdk extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
