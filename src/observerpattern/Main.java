package observerpattern;

import observerpattern.observable.WeatherStation;
import observerpattern.observer.IObserver;
import observerpattern.observer.IPhoneObserver;
import observerpattern.observer.LaptopObserver;
import observerpattern.observer.TVObserver;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(new ArrayList<>());
        IObserver laptopObserver = new LaptopObserver(weatherStation);
        IObserver iphoneObserver = new IPhoneObserver(weatherStation);
        IObserver tvObserver = new TVObserver(weatherStation);

        weatherStation.addObserver(laptopObserver);
        weatherStation.addObserver(tvObserver);
        weatherStation.addObserver(iphoneObserver);

        weatherStation.updateWeather(1, 5, 2);

        weatherStation.removeObserver(laptopObserver);

        //it will now print values only for iphone and tv displays
        weatherStation.updateWeather(2,10, 20);
    }
}
