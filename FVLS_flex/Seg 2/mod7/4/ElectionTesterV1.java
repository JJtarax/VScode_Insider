public class ElectionTesterV1 {
    public static void printElectionResults(Candidate[] candidates, int[] votes) {

        System.out.print("""
                \n\nElections Results:
                                     Votes           % of Total
                Candidate           Recieved            Votes
                ===============================================
                            """);

        int totalVotes = Candidate.sumOfVotes(votes);

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
        String[] names = { "Tony Stark", "Henry Pym", "Bruce Banner", "S____ R_____", "C____ D______" };
        int[] votes = { 751, 496, 303, 225, 81 };
        int j = names.length;
        Candidate[] candidates = new Candidate[j];
        System.out.println(" Raw Election Data:");
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = new Candidate(names[i], votes[i]);
            System.out.println(candidates[i].toString());
        }

        printElectionResults(candidates, votes);

        System.out.println("<< Changing Bruce Banner to Stan Lee >>");

        for (Candidate candidate : candidates) {

            if (candidate.getName().equals("Bruce Banner")) {
                candidate.setName("Stan Lee");
            }
        }

        printElectionResults(candidates, votes);

        System.out.println("<< Changing Henry Pym votes to 284 >>");

        for (Candidate candidate : candidates) {

            if (candidate.getName().equals("Henry Pym")) {
                for (int i = 0; i < votes.length; i++) {
                    if (votes[i] == candidate.getVotes()) {
                        votes[i] = 284;
                    }
                }
                candidate.setVotes(284);

            }
        }

        printElectionResults(candidates, votes);

    }
}
