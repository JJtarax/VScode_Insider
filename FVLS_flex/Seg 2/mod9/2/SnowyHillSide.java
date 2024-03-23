/**
 * This class defines a Snowy Hill Side.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
class SnowyHillSide extends WinterMountain {

    private int amountGoats;

    public SnowyHillSide(int l, int w, int m, float t, int g) {
        super(l, w, m, t);
        amountGoats = g;
    }

    public String getAmountGoats() {
        return " and has " + amountGoats + " goats";
    }

}
