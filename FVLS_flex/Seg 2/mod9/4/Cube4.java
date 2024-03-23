public class Cube4 extends Box4 {

    public Cube4(int l) {
        super(l, l, l);
    }

    @Override
    public String toString() {
        return "The cubes's dimensions are " + getLength() + " X " + getWidth() + " X "
                + getHeight();
    }
}
