/**
 * This file prints all the terrains.
 *
 * @author Tejas Upadhyay
 * @version 3/19/2024
 */
public class GameTerrainTester {
    public static void main(String[] args) {

        Terrain one = new Terrain(150, 240);
        Forest two = new Forest(400, 400, 180);
        Mountain three = new Mountain(600, 200, 12);
        WinterMountain four = new WinterMountain(500, 500, 30, 12.34f);
        Desert five = new Desert(512, 512, 50);
        SnowyHillSide six = new SnowyHillSide(204, 315, 1, 20.24f, 50);

        // Terrian
        System.out.println(one.getTerrainSize());
        System.out.println();

        // Forest
        System.out.println("Forest " + two.getTerrainSize() + two.getForestTree());
        System.out.println();

        // Moutain
        System.out.println("Mountain " + three.getTerrainSize() + three.getMoutainMountains());
        System.out.println();

        // WinterMountain
        System.out.println(
                "Winter Moutain " + four.getTerrainSize() + four.getMoutainMountains() + four.getMoutainTemp());
        System.out.println();

        // Desert
        System.out.println("Desert " + five.getTerrainSize() + five.getDesertCatus());
        System.out.println();

        // Swamp
        System.out.println(
                "Snowy Hillside " + six.getTerrainSize() + six.getMoutainMountains() + six.getMoutainTemp()
                        + six.getAmountGoats());
        System.out.println();
    }
}
