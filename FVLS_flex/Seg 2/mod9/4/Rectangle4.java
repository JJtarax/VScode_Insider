
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Rectangle4 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    // String to display when object is printed.
    @Override
    public String toString() {
        return "The rectangle's dimensions are " + length + " X " + width;
    }

    @Override
    public boolean equals(Object box) {

        Box4 b = (Box4) box;
        String str;
        boolean isEqual = getLength() * getWidth() == b.getLength() * b.getWidth();

        if (isEqual) {
            str = toString() + " IS the same size as " + b.toString();
        } else {
            str = toString() + " is NOT the same size as " + b.toString();

        }
        System.out.println(str);

        return isEqual;
    }

}
