/**
 * Created by Alex on 06.07.2016.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionalsDisplay currentDisplay = new CurrentConditionalsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(29, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
