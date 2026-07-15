public class WeatherResponse {

    private Weather weather;
    private boolean success;
    private String message;

    public WeatherResponse(Weather weather, boolean success, String message) {
        this.weather = weather;
        this.success = success;
        this.message = message;
    }

    public Weather getWeather() {
        return weather;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
