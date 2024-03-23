/**
 * This class defines a Moutain.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
class Mountain extends Terrain {
    private int amountMountains;

    public Mountain(int l, int w, int m) {
        super(l, w);
        amountMountains = m;
    }

    public String getMoutainMountains() {
        return " and has " + amountMountains + " mountains";
    }
}