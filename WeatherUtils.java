public class WeatherUtils {

    public static String getTemperature(double temp) {
        return temp + " °C";
    }

    public static String getHumidity(int humidity) {
        return humidity + "%";
    }

    public static String getWindSpeed(double speed) {
        return speed + " m/s";
    }

    public static String capitalize(String text) {

        if (text == null || text.isEmpty()) {
            return "";
        }

        return text.substring(0, 1).toUpperCase()
                + text.substring(1).toLowerCase();
    }
}
