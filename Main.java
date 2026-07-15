import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("        JAVA WEATHER APP");
        System.out.println("==================================");

        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        WeatherService service = new WeatherService();
        service.getWeather(city);

        scanner.close();
    }
}
