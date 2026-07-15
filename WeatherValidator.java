public class WeatherValidator {

    public static boolean isValidCity(String city) {

        if (city == null) {
            return false;
        }

        city = city.trim();

        if (city.isEmpty()) {
            return false;
        }

        return city.matches("[a-zA-Z ]+");
    }

}
