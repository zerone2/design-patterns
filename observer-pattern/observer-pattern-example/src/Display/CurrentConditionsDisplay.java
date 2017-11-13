package Display;

import Observer.Observer;
import Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {     //WeatherData객체로부터 변경 사항을 받기위해 Observer 구현.
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
