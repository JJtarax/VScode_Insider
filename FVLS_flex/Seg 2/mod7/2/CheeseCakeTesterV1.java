import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args) {
        // initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cakes = new ArrayList<CheeseCakeV1>();

        // add CheeseCake to the ArrayList
        CheeseCakeV1 blueberry = new CheeseCakeV1("Blueberry", 5);
        CheeseCakeV1 strawberry = new CheeseCakeV1("Strawberry", 6);
        CheeseCakeV1 cherry = new CheeseCakeV1("Cherry", 4);
        CheeseCakeV1 jalapeno = new CheeseCakeV1("Jalapeno", 1);
        CheeseCakeV1 dillPickle = new CheeseCakeV1("Dill Pickle", 2);
        CheeseCakeV1 fig = new CheeseCakeV1("Fig", 3);
        cakes.add(blueberry);
        cakes.add(strawberry);
        cakes.add(cherry);
        cakes.add(jalapeno);
        cakes.add(dillPickle);
        cakes.add(fig);

        // calls several methods for each object to perform calculations
        for (CheeseCakeV1 dataRecord : cakes) {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }

        // printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        // using a for loop to print out the objects' data
        for (int index = 0; index < cakes.size(); index++) {
            CheeseCakeV1 dataRecord = cakes.get(index);
            System.out.printf("| %3d   | %5d    | %-13s |      %-1d oz    | %6d   | %4.2f  cups| %3d tsps  |\n",
                    index, dataRecord.getquantity(), dataRecord.getFlavor(),
                    dataRecord.getCreamCheese(), dataRecord.getServings(),
                    dataRecord.getSugar(), dataRecord.getVanilla());
        }
    }
}
