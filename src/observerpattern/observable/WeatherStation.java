package observerpattern.observable;

import observerpattern.observable.IObservable;
import observerpattern.observer.IObserver;

import java.util.List;

public class WeatherStation implements IObservable {

    List<IObserver> notificationObservers;

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    int temperature, pressure, humidity;
    public WeatherStation(List<IObserver> notificationObservers) {
        this.notificationObservers = notificationObservers;
    }

    @Override
    public void addObserver(IObserver observer) {
        notificationObservers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        notificationObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i<notificationObservers.size(); i++)
        {
           notificationObservers.get(i).update();
        }
    }

    public void updateWeather(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }
}
