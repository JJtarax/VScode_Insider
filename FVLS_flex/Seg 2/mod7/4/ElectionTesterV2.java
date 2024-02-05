import java.util.ArrayList;

public class ElectionTesterV2 {
    public static void main(String[] args) {
        ArrayList<Candidate> cakes = new ArrayList<Candidate>();

        // add Blueberry to the ArrayList
        Candidate ts = new Candidate("Tony Stark", 3691);
        Candidate hp = new Candidate("Henry Pym", 2691);
        Candidate bb = new Candidate("B____ B_____", 1962);
        Candidate sr = new Candidate("S____ R_____", 1491);
        Candidate cd = new Candidate("C____ D______", 1968);

        cakes.add(ts);
        cakes.add(hp);
        cakes.add(bb);
        cakes.add(sr);
        cakes.add(cd);
    }
}
