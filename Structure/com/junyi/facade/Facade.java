package com.junyi.facade;


public class Facade {
    private SubSystem sus = new SubSystem();
    public void start() {
        sus.turnOnTV();
        sus.setCD("hit pop");
        sus.start();
    }
}

