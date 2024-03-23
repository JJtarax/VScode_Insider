/**
 * This class defines a Desert.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
class Desert extends Terrain {
    private int amountCatus;

    public Desert(int l, int w, int c) {
        super(l, w);
        amountCatus = c;
    }

    public String getDesertCatus() {
        return " and has " + amountCatus + " catus";
    }
}