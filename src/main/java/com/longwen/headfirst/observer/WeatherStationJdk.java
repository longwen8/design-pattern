package com.longwen.headfirst.observer;

/**
 * Created by huangxinping on 19/12/5.
 */
public class WeatherStationJdk {

    public static void main(String[] args) {

        WeaterDataJdk weaterDataJdk = new WeaterDataJdk();
        CurrentConditionsDisplayJdk currentConditionsDisplayJdk = new CurrentConditionsDisplayJdk(weaterDataJdk);

        weaterDataJdk.setMeasurements(90,70,40f);
    }
}
