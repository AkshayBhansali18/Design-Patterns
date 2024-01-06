package observerpattern.observer;

import observerpattern.observable.WeatherStation;

public class IPhoneObserver implements IObserver, IDisplay {

    WeatherStation weatherStation;

    public IPhoneObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Weather conditions have changed. Updating Iphone display with updated values");
        display();
    }

    @Override
    public void display() {
        int temperature = weatherStation.getTemperature();
        int pressure = weatherStation.getPressure();
        int humidity = weatherStation.getHumidity();
        System.out.println("Displaying new weather parameters on the Iphone display..."+ "temperature: "+ temperature+
                "pressure: "+ pressure+
                "humidity: "+ humidity+"\n");
    }
}
