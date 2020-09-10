package ObserverPattern;




public class CurrentConditionDisplay implements Observer {
    public CurrentConditionDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}

