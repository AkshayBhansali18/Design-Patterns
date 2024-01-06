package observerpattern.observer;

import observerpattern.observable.WeatherStation;

public class LaptopObserver implements IObserver, IDisplay{

    WeatherStation weatherStation;

    public LaptopObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Weather conditions have changed. Updating Laptop display with updated values");
        display();
    }

    @Override
    public void display() {
        int temperature = weatherStation.getTemperature();
        int pressure = weatherStation.getPressure();
        int humidity = weatherStation.getHumidity();
        System.out.println("Displaying new weather parameters on the laptop display..."+ "temperature: "+ temperature+
                "pressure: "+ pressure+
                "humidity: "+ humidity+"\n");
    }
}
