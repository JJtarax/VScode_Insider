public class RectangularPrism4 extends Box4 {

    public RectangularPrism4(int l, int w, int h) {
        super(l, w, h);
    }

    @Override
    public String toString() {
        return "The rectangular prism's dimensions are " + getLength() + " X " + getWidth() + " X "
                + getHeight();
    }
}
