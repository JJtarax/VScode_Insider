import java.util.ArrayList;

public class ElectionTesterV2 {
    public static void printElectionResults(ArrayList<Candidate> candidates) {

        System.out.print("""
                \n\nElections Results:
                                     Votes           % of Total
                Candidate           Received            Votes
                ===============================================
                            """);

        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotes();
        }

        for (Candidate candidate : candidates) {
            float percentVotes = ((float) candidate.getVotes() / totalVotes) * 100;
            if (percentVotes < 10.0 || candidate.getVotes() <= 99.0) {
                if (percentVotes < 10.0 || candidate.getVotes() <= 99.0) {
                    System.out.printf("%-22s %-18d %.2f \n", candidate.getName(), candidate.getVotes(), percentVotes);
                } else if (candidate.getVotes() < 100.0) {
                    System.out.printf("%-22s %-18d %.2f \n", candidate.getName(), candidate.getVotes(), percentVotes);
                } else if (percentVotes < 10.0) {
                    System.out.printf("%-21s %-19d %.2f \n", candidate.getName(), candidate.getVotes(), percentVotes);
                }
            } else {
                System.out.printf("%-21s %-18d %.2f \n", candidate.getName(), candidate.getVotes(), percentVotes);

            }
        }

        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    public static void main(String[] args) {
        ArrayList<Candidate> votes = new ArrayList<Candidate>();

        // add Blueberry to the ArrayList
        Candidate ts = new Candidate("Tony Stark", 3691);
        Candidate hp = new Candidate("Henry Pym", 2691);
        Candidate bb = new Candidate("B____ B_____", 1962);
        Candidate sr = new Candidate("S____ R_____", 1491);
        Candidate cd = new Candidate("C____ D______", 1968);

        votes.add(ts);
        votes.add(hp);
        votes.add(bb);
        votes.add(sr);
        votes.add(cd);

        System.out.println(" Raw Election Data:");
        for (Candidate candidate : votes) {
            System.out.println(candidate.toString());
        }

        printElectionResults(votes);

        for (Candidate candidate : votes) {
            if (candidate.getName().equals("B____ B_____")) {
                candidate.setName("Stan Lee");
            }
        }

        printElectionResults(votes);

        for (Candidate candidate : votes) {
            if (candidate.getName().equals("Henry Pym")) {
                candidate.setVotes(284);
            }
        }

        printElectionResults(votes);

    }
}
