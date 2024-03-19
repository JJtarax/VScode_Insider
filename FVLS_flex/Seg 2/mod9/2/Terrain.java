
/**
 * This class defines a basic Terrain.
 *
 * @author Tejas Upadhyay
 * @version 3/16/2024
 */

public class Terrain {
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize() {
        return "Land has dimensions " + length + " X " + width;
    }
}

class Forest extends Terrain {
    private int tree;

    public Forest(int l, int w, int t) {
        super(l, w);
        tree = t;
    }

    public String getForestTree() {
        return " and has " + tree + " trees";
    }

}

class Mountain extends Terrain {
    private int mountains;

    public Mountain(int l, int w, int m) {
        super(l, w);
        mountains = m;
    }

    public String getMoutainMountains() {
        return " and has " + mountains + " mountains";
    }
}

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

class Desert extends Terrain {
    private int catus;

    public Desert(int l, int w, int c) {
        super(l, w);
        catus = c;
    }

    public String getDesertCatus() {
        return " and has " + catus + " catus";
    }
}

class Home {
    private String color;
    private int length, width;

    public Home(int l, int w, String c) {
        length = l;
        width = w;
        color = c;
    }

    public String getHomeSize() {
        return " has dimensions " + length + " X " + width;
    }

    public String getHomeColor() {
        return " and the house color is " + color;
    }

}
