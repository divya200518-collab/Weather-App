import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {

    // Replace this with your own API key later
    private static final String API_KEY = "YOUR_API_KEY";

    public void getWeather(String city) {

        try {

            String urlString =
                    "https://api.openweathermap.org/data/2.5/weather?q="
                            + city
                            + "&appid="
                            + API_KEY
                            + "&units=metric";

            URL url = new URL(urlString);

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {

                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(connection.getInputStream()));

                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // For now, print the raw JSON response
                System.out.println("\nWeather Data:");
                System.out.println(response.toString());

            } else {
                System.out.println("City not found or API error!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
