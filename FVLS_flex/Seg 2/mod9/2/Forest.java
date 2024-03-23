/**
 * This class defines a Forest.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
class Forest extends Terrain {
    private int amountTrees;

    public Forest(int l, int w, int t) {
        super(l, w);
        amountTrees = t;
    }

    public String getForestTree() {
        return " and has " + amountTrees + " trees";
    }

}