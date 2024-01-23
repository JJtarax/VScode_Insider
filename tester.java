import java.util.ArrayList;

/**
 * This class demonstrates the toString method.
 *
 * @author Jean E. Sammet
 * @version 06/16/17
 */

class ComputerLanguage {
    private String language;
    private double version;

    ComputerLanguage(String language, double version) {
        this.language = language;
        this.version = version;
    }

    public String toString() {
        return String.format("%-12s %5.2f", this.language, this.version);
    }
}

public class tester {
    public static void main(String[] args) {
        ArrayList<Double> aList = new ArrayList<Double>();
        aList.add(3.5);
        aList.add(4.3);
        aList.add(1, 12.3);
        aList.set(2, 18.9);
        aList.add(-42.6);
        aList.set(0, -20.3);
        aList.remove(3);
        aList.add(24.8);

        System.out.println(aList);
    }
}
