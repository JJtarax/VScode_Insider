public class Catapult {

    public Catapult() {
    }

    public int calculateDistance(int speed, int angle) {
        final double gravity = 9.81;
        double radians = 2 * Math.toRadians(angle);
        double distance = (speed * speed) * Math.sin(radians) / gravity;
        return (int) distance;
    }
}
