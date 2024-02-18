import java.util.ArrayList;

public class ElectionTesterV4V3 {
    public static void printElectionResults(ArrayList<Candidate> candidates) {

        System.out.print("""
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
        ArrayList<Candidate> candidates = new ArrayList<>();

        // add Candidates to the ArrayList
        candidates.add(new Candidate("Tony Stark", 751));
        candidates.add(new Candidate("Henry Pym", 496));
        candidates.add(new Candidate("Bruce Banner", 303));
        candidates.add(new Candidate("S____ R_____", 225));
        candidates.add(new Candidate("C____ D______", 81));

        // System.out.println(" Raw Election Data:");
        // for (Candidate candidate : candidates) {
        // System.out.println(candidate.toString());
        // }

        System.out.println("Original Results:\n");
        printElectionResults(candidates);

        // Changing Bruce Banner to Stan Lee
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals("Bruce Banner")) {
                candidate.setName("Stan Lee");
            }
        }

        System.out.println("<< Changing Bruce Banner to Stan Lee >>\n");
        printElectionResults(candidates);

        // Changing Henry Pym votes to 284
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals("Henry Pym")) {
                candidate.setVotes(284);
            }
        }

        System.out.println("\n\n<< Changing Henry Pym votes to 284 >>\n");
        printElectionResults(candidates);

    }

}
