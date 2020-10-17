package com.junyi.ObserverPattern;



public class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}

