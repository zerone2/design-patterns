public class ObserverPattern {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 20.3f);
        
        System.out.println("---------------------------");
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(55, 20, 35f);
        
        System.out.println("---------------------------");
        weatherData.registerObserver(statisticsDisplay);
        weatherData.setMeasurements(55, 20, 35f);
    }
}
