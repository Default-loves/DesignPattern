package com.junyi.java.Behavioral;

/*
观察者模式
定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者，Subject是一个，而Observer是多个。

主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
 */

import java.util.List;
public class ObserverPattern {}



//天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}

public class WeatherSubject implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float pressure;
    private float humidity;

    public void setMeasurement(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this. pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(temperature, pressure, humidity);
        }
    }
}

public class StatisticsDisplay implements Observer {
    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}

public class CurrentConditionDisplay implements Observer {
    public CurrentConditionDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}

public class WeatherStation {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherSubject);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherSubject);
        weatherSubject.setMeasurement(1, 0, 0);
        weatherSubject.setMeasurement(3, 2, 9);
    }
}
