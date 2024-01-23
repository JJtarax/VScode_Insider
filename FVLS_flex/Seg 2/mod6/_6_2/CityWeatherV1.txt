/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] month;
    private double[] temperature;
    private double[] precipitation;

    // constructor with parameters
    public CityWeatherV1(String[] month, double[] temperature, double[] precipitation) {
        this.month = month;
        this.temperature = temperature;
        this.precipitation = precipitation;
    }

    // setters and getters for each private instance variable
    public String[] getMonth() {
        return month;
    }

    public void setMonth(String[] month) {
        this.month = month;
    }

    public double[] getTemperature() {
        return temperature;
    }

    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    public double[] getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double[] precipitation) {
        this.precipitation = precipitation;
    }

    // method to calculate the average of temperature

    public double averageTemperature() {
        return (temperature[0] + temperature[1] + temperature[2] + temperature[3] + temperature[4]
                + temperature[5] + temperature[6] + temperature[7] + temperature[8] + temperature[9] + temperature[10]
                + temperature[11]) / 12;
    }

    // method to calculate total precipitation array
    public double totalPrecipitation() {
        return precipitation[0] + precipitation[1] + precipitation[2] + precipitation[3]
                + precipitation[4] + precipitation[5] + precipitation[6] + precipitation[7] + precipitation[8]
                + precipitation[9] + precipitation[10] + precipitation[11];
    }

    // method to calculate temperature in Celsius (current index of temperature
    // array passed as a parameter) - to be completed in 6.02
    public void CelsiusToFahrenheit() {
        int i = 0;
        // System.out.println("C");
        while (i != 12) {
            temperature[i] = (temperature[i] - 32.0) * (5.0 / 9.0);
            // System.out.println(temperature[i]);
            i++;
        }
    }

    // method to calculate precipitation in centimeters (current index of
    // precipitation array passed as a parameter) - to be completed in 6.02
    public void InchesToCentimeters() {
        int i = 0;
        // System.out.println("Cm");
        while (i != 12) {
            precipitation[i] = (precipitation[i] * 2.54);
            // System.out.println(precipitation[i]);
            i++;
        }
    }

}
