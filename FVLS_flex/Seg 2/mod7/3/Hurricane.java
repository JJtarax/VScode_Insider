import java.text.DecimalFormat;

/**
 * @purpose: Hurricane Object Class
 *
 * @author APCS Team
 * @version FLVS 2020
 *
 */

public class Hurricane {
   private String name, month;
   private int year;
   private int cat;
   private int pressure;
   private double windspeed;

   // constructor - all private instance variables initialized
   public Hurricane(int y, String n, String m, int c, int p, double w) {
      this.year = y;
      this.name = n;
      this.month = m;
      this.cat = c;
      this.pressure = p;
      this.windspeed = w;
   }

   // accessor for year
   public int getYear() {
      return year;
   }

   // accessor for name
   public String getName() {
      return name;
   }

   // accessor for month
   public String getMonth() {
      return month;
   }

   // accessor for category
   public int getCat() {
      return cat;
   }

   // accessor for pressure
   public int getPressure() {
      return pressure;
   }

   // accessor for windspeed
   public double getWindspeed() {
      return windspeed;
   }

   // mutator for year
   public void setYear(int y) {
      year = y;
   }

   // mutator for name
   public void setName(String n) {
      name = n;
   }

   // mutator for month
   public void setMonth(String m) {
      month = m;
   }

   // mutator for category
   public void setCat(int c) {
      cat = c;
   }

   // mutator for pressure
   public void setPressure(int p) {
      pressure = p;
   }

   // mutator for windspeed
   public void setWindspeed(double w) {
      windspeed = w;
   }

   public static String toString(int yearRangeTo, int yearRangeFrom, Hurricane[] hurricanes, int[] categories,
         int[] years,
         int[] pressures, double[] windSpeeds) {
      String result = String.format(
            "\t\t\tHurricanes %d - %d\nYear\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)\n", yearRangeFrom,
            yearRangeTo);

      DecimalFormat df = new DecimalFormat("0.00");
      for (Hurricane hurricane : hurricanes) {
         if (hurricane.getYear() >= yearRangeFrom && hurricane.getYear() <= yearRangeTo) {
            String name = hurricane.getName();
            if (name.length() > 7) {
               result += String.format("%d\t%s\t\t\b\b\b\b\b%1d\t\t %s\t\t %s%n",
                     hurricane.getYear(),
                     name, hurricane.getCat(),
                     hurricane.getPressure() < 1000 ? " " + hurricane.getPressure()
                           : hurricane.getPressure(),
                     hurricane.getWindspeed() < 100 ? " " + df.format(hurricane.getWindspeed())
                           : df.format(hurricane.getWindspeed()));
            } else {
               result += String.format("%d\t%s\t\t\t\b\b\b\b\b%1d\t\t %s\t\t %s%n",
                     hurricane.getYear(),
                     name, hurricane.getCat(),
                     hurricane.getPressure() < 1000 ? " " + hurricane.getPressure()
                           : hurricane.getPressure(),
                     hurricane.getWindspeed() < 100 ? " " + df.format(hurricane.getWindspeed())
                           : df.format(hurricane.getWindspeed()));
            }
         }
      }
      result += "==================\n";
      return result;
   }

   public static double getAverageValue(double[] array, int[] years, int yearFrom, int yearTo) {
      double sum = 0;
      int count = 1;
      for (int i = 0; i < array.length; i++) {
         if (yearFrom <= years[i] && yearTo >= years[i]) {
            sum += array[i];
            count++;
         }
      }
      return sum / (count - 1);
   }

   public static double getAverageValue(int[] array, int[] years, int yearFrom,
         int yearTo) {
      double sum = 0;
      int count = 1;
      for (int i = 0; i < array.length; i++) {
         if (yearFrom <= years[i] && yearTo >= years[i]) {
            sum += array[i];
            count++;
         }
      }
      return sum / (count - 1);
   }

   public static double getMaxValue(double[] array, int[] years, int yearFrom, int yearTo) {
      double maxValue = Integer.MIN_VALUE;
      for (int i = 0; i < array.length; i++) {
         if (array[i] > maxValue && (yearFrom <= years[i] && yearTo >= years[i])) {
            maxValue = array[i];
         }
      }
      return maxValue;
   }

   public static double getMinValue(double[] array, int[] years, int yearFrom, int yearTo) {
      double minValue = Integer.MAX_VALUE;
      for (int i = 0; i < array.length; i++) {
         if (array[i] < minValue && (yearFrom <= years[i] && yearTo >= years[i])) {
            minValue = array[i];
         }
      }
      return minValue;
   }

   public static int getMaxValue(int[] array, int[] years, int yearFrom, int yearTo) {
      int maxValue = Integer.MIN_VALUE;
      for (int i = 0; i < array.length; i++) {
         if (array[i] > maxValue && (yearFrom <= years[i] && yearTo >= years[i])) {
            maxValue = array[i];
         }
      }
      return maxValue;
   }

   public static int getMinValue(int[] array, int[] years, int yearFrom, int yearTo) {
      int minValue = Integer.MAX_VALUE;
      for (int i = 0; i < array.length; i++) {
         if (array[i] < minValue && (years[i] >= yearFrom && years[i] <= yearTo)) {
            minValue = array[i];
         }
      }
      return minValue;
   }

}
