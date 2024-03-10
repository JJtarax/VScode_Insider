public class CatapultTester {
    public static void main(String[] args) {
        int[] speedArray = { 20, 25, 30, 35, 40, 45, 50 };
        int[] angleArray = { 25, 30, 35, 40, 45, 50 };
        double[][] twoDimArray = new double[7][6];

        for (int i = 0; i < speedArray.length; i++) {
            for (int j = 0; j < angleArray.length; j++) {
                Catapult catapult = new Catapult();
                twoDimArray[i][j] = catapult.calculateDistance(speedArray[i], angleArray[j]);
            }
        }
        printResults(twoDimArray, speedArray, angleArray);
    }

    public static void printResults(double[][] array, int[] speed, int[] angle) {
        System.out.printf("Projectile Distance (feet)\n");
        System.out.printf("%-7s", "   MPH");
        for (int i = 0; i < angle.length; i++) {
            System.out.printf("%d %-7s", angle[i], " deg");
        }
        System.out.println(
                "\n==================================================================================================");
        for (int i = 0; i < speed.length; i++) {
            System.out.printf("%-7d", speed[i]);
            for (int j = 0; j < angle.length; j++) {
                System.out.printf("%-7.0f", array[i][j]);

            }
            System.out.println("");
        }
    }
}