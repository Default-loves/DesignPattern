package com.junyi.ObserverPattern;

/*
观察者模式
定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者，Subject是一个，而Observer是多个。

主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
 */
/**
 * @time: 2020/9/10 11:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Application {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherSubject);
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherSubject);
        weatherSubject.setMeasurement(1, 0, 0);
        weatherSubject.setMeasurement(3, 2, 9);
    }
}
