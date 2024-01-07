
/**
 * Annual Weather client class
 * 
 * @author Tejas Upadhyay
 * @version Januray __ 2024
 */
import java.util.Scanner;

public class CityWeatherTesterV1 {
    Scanner in = new Scanner(System.in);

    // method to print results (formatting output will be done in 6.02)
    public static void print(String city, String state, String tempLabel, String precipLabel,
            CityWeatherV1 cityWeather) {

        // Output: display table of weather data including average and total

        System.out.println();
        System.out.println("                 Weather Data");
        System.out.println("         Location: " + city + ", " + state);
        System.out.println("Month       Temperature (" + tempLabel + ")       Precipitation (" +
                precipLabel + ")");
        System.out.println();
        System.out.println("*********************************************************");
        for (int i = 0; i < cityWeather.getTemperature().length; i++) {

            System.out.printf(cityWeather.getMonth()[i]);
            System.out.printf("%17.1f", cityWeather.getTemperature()[i]);
            System.out.printf("%23.1f%n", cityWeather.getPrecipitation()[i]);

        }
        System.out.println(
                "    Average: " + cityWeather.averageTemperature() + " Total: " + cityWeather.totalPrecipitation());
        System.out.println("*********************************************************");

    }

    public static void main(String[] args) {

        // Declare and initialize variables
        Scanner in = new Scanner(System.in); // will be used in 6.02
        String city = "Fort Myers"; // choose a city from the table provided
        String state = "Florida"; // choose a city from the table provided

        String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double[] temperature = { 64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.7, 66.4 };
        double[] precipitation = { 2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6 };

        String tempLabel = "F"; // initialize to F
        String precipLabel = "in."; // initialize to in

        // instantiate CityWeatherV1 object
        CityWeatherV1 cityWeather = new CityWeatherV1(month, temperature, precipitation);

        // print average temperature and total precipitation
        System.out.println();

        // input to decide F/C and in/cm - to be completed in 6.02
        System.out.print("Do you want the results in F or C? ");
        String Temp = in.nextLine().toLowerCase();
        System.out.print("Do you want the results Inches In or Centimeters? ");
        String length = in.nextLine().toLowerCase();

        // conditions & method call to convert temp, if needed - to be completed in 6.02
        if (Temp.equals("c")) {
            cityWeather.CelsiusToFahrenheit();

        }

        // conditions & method call to convert prec, if needed - to be completed in 6.02
        if (length.equals("cm") || length.equals("centimeters")) {
            cityWeather.InchesToCentimeters();

        }

        // method call to calculate the average temperature
        System.out.println(cityWeather.averageTemperature());
        // method call to calculate the total precipitation
        System.out.println(cityWeather.totalPrecipitation());

        // method call to print results (hint: Need parameters for month, temperature,
        // precipitation arrays, data labels and the average temperature, total
        // precipitation variables)
        print(city, state, tempLabel, precipLabel, cityWeather);

    }// end main
}// end class
