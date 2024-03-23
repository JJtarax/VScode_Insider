import javax.swing.Box;

/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h) {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight() {
        return height;
    }

    // String to display when object is printed.

    @Override
    public String toString() {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X "
                + height;
    }

    @Override
    public boolean equals(Object box) {

        Box4 b = (Box4) box;
        String str;
        boolean isEqual = getLength() * getWidth() * getHeight() == b.getLength() * b.getWidth() * b.getHeight();

        if (isEqual) {
            str = toString() + " IS the same size as " + b.toString();
        } else {
            str = toString() + " is NOT the same size as " + b.toString();

        }
        System.out.println(hello());
        System.out.println(str);
        return isEqual;
    }

    public static String hello() {
        return "Hello World";
    }

}
