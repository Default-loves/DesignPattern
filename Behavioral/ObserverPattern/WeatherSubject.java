package ObserverPattern;


import java.util.List;


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

