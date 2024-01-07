
public class planetGravity {

    public static void title() {
        System.out.print("""

                \t\t\tPlanetary Data
                  Planet\tDiameter (km)\tMass (kg)\tg (m/g2)
                ----------------------------------------------------------
                """);
    }

    public static double calcSurfaceGravity(double M, double r) {
        double g = (6.67430e-11 * M) / Math.pow((r * 1000), 2);
        g = (int) (g * 100) / 100.0;
        return g;
    }

    public static String printPlanetData(double M, double r, String planetName) {
        String planetData = ("  " + planetName + "\t\t" + (r + r) + "\t\t" + M + "\t" + calcSurfaceGravity(M, r));

        return planetData;
    }

    public static void main(String[] args) {
        title();

        String planetName = "Venus";
        double M = 4.869e24;
        double r = 12103.6 / 2;
        System.out.println(printPlanetData(M, r, planetName));

        System.out.println();
    }
}
