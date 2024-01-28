
/**
 * Starter code for the Hurricane Tester
 * Tejas Upadhyay
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.Year;
import java.io.File;
import java.util.Scanner;

public class HurricaneTester

{

    public static void main(String[] args) throws IOException {

        // read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        // count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();

        // initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];

        // read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble() * 1.15;
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        // convert the windspeed, determine categories, calculate sums
        int[] categories = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95) {
                categories[i] = 1;
            } else if (windSpeeds[i] >= 96 && windSpeeds[i] <= 110) {
                categories[i] = 2;
            } else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129) {
                categories[i] = 3;
            } else if (windSpeeds[i] >= 130 && windSpeeds[i] <= 156) {
                categories[i] = 4;
            } else {
                categories[i] = 5;
            }
        }

        // create a Hurricane ArrayList using the data above
        Hurricane[] hurricanes = new Hurricane[numValues];
        for (int i = 0; i < numValues; i++) {
            hurricanes[i] = new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]);
        }

        // user prompted for range of years
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter starting year");
        int yearRangeFrom = in.nextInt();
        System.out.println("Please enter end year");
        int yearRangeTo = in.nextInt();
        in.close();

        if (yearRangeTo < yearRangeFrom) {
            System.out.println("Your starting year needs to be less then your end year");
            return;
        }
        if (yearRangeFrom < years[0] || yearRangeTo > years[years.length - 1]) {
            System.out.printf(
                    "The data that we have range of is from " + years[0] + " to " + years[years.length - 1] + "\n");
            return;
        }
        System.out.println(
                Hurricane.toString(yearRangeTo, yearRangeFrom, hurricanes, categories, years, pressures, windSpeeds));
        // // print the data
        // System.out.println("\t\t\tHurricanes " + yearRangeFrom + " - " +
        // yearRangeTo);
        // System.out.println("""
        // Year\tHurricane\tCategory\tPressuure (mb)\tWind Speed (mph)
        // ========================================================================""");
        // DecimalFormat df = new DecimalFormat("0.00");
        // for (Hurricane hurricane : hurricanes) {
        // if (hurricane.getYear() >= yearRangeFrom && hurricane.getYear() <=
        // yearRangeTo) {
        // if (hurricane.getName().length() > 7)
        // System.out.printf("%d\t%s\t\t\b\b\b\b\b%1d\t\t %s\t\t %s%n",
        // hurricane.getYear(),
        // hurricane.getName(), hurricane.getCat(),
        // hurricane.getPressure() < 1000 ? " " + hurricane.getPressure()
        // : hurricane
        // .getPressure(),
        // hurricane.getWindspeed() < 100 ? " " + df.format(hurricane.getWindspeed())
        // : df.format(hurricane.getWindspeed()));
        // else
        // System.out.printf("%d\t%s\t\t\t\b\b\b\b\b%1d\t\t %s\t\t %s%n",
        // hurricane.getYear(),
        // hurricane.getName(), hurricane.getCat(),
        // hurricane.getPressure() < 1000 ? " " + hurricane.getPressure()
        // : hurricane
        // .getPressure(),
        // hurricane.getWindspeed() < 100 ? " " + df.format(hurricane.getWindspeed())
        // : df.format(hurricane.getWindspeed()));
        // }
        // }
        // System.out.println("========================================================================");
        // System.out.printf("\tAverage: %13.1f %18.1f %14.2f%n",
        // Hurricane.getAverageValue(categories, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getAverageValue(pressures, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getAverageValue(windSpeeds, years, yearRangeFrom, yearRangeTo));
        // System.out.printf("\tMinimum: %11d %18d %16.2f%n",
        // Hurricane.getMinValue(categories, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getMinValue(pressures, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getMinValue(windSpeeds, years, yearRangeFrom, yearRangeTo));
        // System.out.printf("\tMaximum: %11d %18d %16.2f%n",
        // Hurricane.getMaxValue(categories, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getMaxValue(pressures, years, yearRangeFrom, yearRangeTo),
        // Hurricane.getMaxValue(windSpeeds, years, yearRangeFrom, yearRangeTo));
    }
}