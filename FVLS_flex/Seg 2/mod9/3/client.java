
/**
 * This client will print the values of a polygon that has been provided.
 *
 * @author Tejas Upadhyay
 * @version 3/20/24
 */

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {
        // Create instances of each circle class
        Circle2 circle = new Circle2(2, 5, 5);
        Cylinder2 cylinder = new Cylinder2(10, 15, 5, 10);
        Oval2 oval = new Oval2(25, 10, 5, 7);
        OvalCylinder2 ovalCylinder = new OvalCylinder2(40, 10, 5, 7, 10);

        // Add circle objects to ArrayList
        ArrayList<Circle2> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(cylinder);
        circles.add(oval);
        circles.add(ovalCylinder);

        // Test showCenter method
        for (Circle2 c : circles) {
            showCenter(c);
        }
    }

    // Method to show the center of a circle
    public static void showCenter(Circle2 circle) {
        System.out.println("For this " + circle.getName() + "2 the center is at" + circle.getCenter() + ".");
    }
}
