/**
 * @purpose
 *
 * @author Tejas Upadhyay
 * @version (enter today's date)
 *
 */
public class CheeseCakeV1 {
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;

    /**
     * Constructor for objects of type CheeseCakeV1
     * 
     * @param flavor
     * @param quantity
     */
    CheeseCakeV1(String flavor, int quantity) {
        // ******* fill in code for constructor here ****//
        this.myFlavor = flavor;
        this.myQuantity = quantity;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings() {
        // ******* fill in code for method here - 16 servings per cake ****//
        int servings = 0;
        for (int i = 0; i <= this.myQuantity; i++) {
            servings += 16;
        }

    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese() {
        // ******* fill in rest of method here - 32 ounces per cake ****//
        int CreamCheese = 0;
        for (int i = 0; i <= this.myQuantity; i++) {
            CreamCheese += 32;
        }
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla() {
        // ******* fill in rest of method here - 1 teaspoon per cake ****//
        int Vaniila = 0;
        for (int i = 0; i <= this.myQuantity; i++) {
            Vaniila += 1;
        }
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar() {
        // ******* fill in rest of method here - 1/3 cup per cake ****//
        double Sugar = 0;
        for (int i = 0; i <= this.myQuantity; i++) {
            Sugar += 1 / 3;
        }
    }

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity() {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor() {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar() {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese() {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla() {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings() {
        return myServings;
    }

    public String toString() {
        // ******* Practice your printf() skills by formatting this data! ****//
        return String.format("The data that matches the headings in the CheeseCakeV1 file");
    }
}