
/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args) {
        // initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        // add CheeseCake to the ArrayList

        // calls several method for each object to perform calculations
        for (CheeseCakeV1 dataRecord : cake) {
            // invoke methods
        }

        // printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;

        // using a for loop to print out the objects' data
        for (int index = 0; index < cake.size(); index++) {
            // print each CheeseCake's data
        }
    }
}
