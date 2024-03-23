/**
 * This class defines a Winter Mountain.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
class WinterMountain extends Mountain {
    private float temp;

    public WinterMountain(int l, int w, int m, float t) {
        super(l, w, m);
        temp = t;
    }

    public String getMoutainTemp() {
        return " and has a temperature of " + temp + " degrees";
    }
}
