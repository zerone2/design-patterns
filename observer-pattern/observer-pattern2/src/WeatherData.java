import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    /**
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    /**
     *
     * @param o
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
