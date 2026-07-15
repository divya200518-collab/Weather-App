public class WeatherPrinter {

    public static void printWeather(Weather weather) {

        System.out.println("\n============================");
        System.out.println("       WEATHER REPORT");
        System.out.println("============================");
        System.out.println("City        : " + weather.getCity());
        System.out.println("Temperature : " + weather.getTemperature() + " °C");
        System.out.println("Humidity    : " + weather.getHumidity() + "%");
        System.out.println("Wind Speed  : " + weather.getWindSpeed() + " m/s");
        System.out.println("Condition   : " + weather.getCondition());
        System.out.println("============================");
    }
}
