
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
import java.util.ArrayList;

public class client {
    public static void main(String[] args) {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4, 4, 4);
        Rectangle4 three = new Box4(4, 12, 8);
        Rectangle4 four = new Cube4(4);
        Rectangle4 five = new Kite4(12, 1);
        Rectangle4 six = new RectangularPrism4(16, 1, 1);

        // Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);

        System.out.println("My shapes:\n");
        for (Rectangle4 rect : shapes) {
            System.out.println(rect);
            // showEffectBoth(rect);
            // System.out.println();
        }
        System.out.println();

        System.out.println("Test for equality:\n");
        two.equals(four);
        System.out.println();
        three.equals(four);
        System.out.println();
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r);
    }

}
