package observerpattern.observer;

import observerpattern.observable.WeatherStation;

public class TVObserver implements IObserver, IDisplay{

    WeatherStation weatherStation;

    public TVObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Weather conditions have changed. Updating TV display with updated values");
        display();
    }

    @Override
    public void display() {
        int temperature = weatherStation.getTemperature();
        int pressure = weatherStation.getPressure();
        int humidity = weatherStation.getHumidity();
        System.out.println("Displaying new weather parameters on the TV display..."+ "temperature: "+ temperature+
                "pressure: "+ pressure+
                "humidity: "+ humidity+"\n");
    }
}
