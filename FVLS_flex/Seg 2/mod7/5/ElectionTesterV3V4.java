// Purpose of Project: To list the results of the election
// Version/Date: 02/09/2023
// Author: Tejas Upadhyay

public class ElectionTesterV3V4 {

    public static int sumOfVotesArray(int[] voteAmount) {
        int sum = 0;

        for (int votes : voteAmount) {
            sum += votes;
        }
        return sum;
    }

    public static void printArrayOfCadidates(Candidate[] candidates, int totalVotes) {
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
    }

    public static void printArrayOfElectionResults(Candidate[] candidates, int[] votes) {

        System.out.print("""
                                     Votes           % of Total
                Candidate           Recieved            Votes
                ===============================================
                            """);

        int totalVotes = sumOfVotesArray(votes);

        printArrayOfCadidates(candidates, totalVotes);
        // System.out.println(candidates.toString());

        System.out.println("\nThe total number of votes is: " + totalVotes);
    }

    public static void updateNameOfCandidateArray(Candidate[] candidates, String oldName, String newName) {
        int i = 0;
        for (Candidate candidate : candidates) {

            if (candidate.getName().equals(oldName)) {
                Candidate newCandidate = new Candidate("", candidate.getVotes());
                candidates[i] = newCandidate;
                newCandidate.setName(newName);
                System.out.println(candidate.toString());
            }
            i++;
        }
    }

    public static void updateCandidateVotesArray(Candidate[] candidates, String targetName, int[] votes,
            int newVoteCount) {
        for (Candidate candidate : candidates) {

            if (candidate.getName().equals(targetName)) {
                for (int i = 0; i < votes.length; i++) {
                    if (votes[i] == candidate.getVotes()) {
                        votes[i] = newVoteCount;
                    }
                }
                candidate.setVotes(newVoteCount);
                System.out.println(candidate.toString());
            }
        }
    }

    public static Candidate[] createCandidatesArray(String[] names, int[] votes) {
        Candidate[] candidates = new Candidate[names.length];

        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = new Candidate(names[i], votes[i]);
            System.out.println(candidates[i].toString());
        }

        return candidates;
    }

    public static void main(String[] args) {
        String[] names = { "Tony Stark", "Henry Pym", "Bruce Banner", "S____ R_____", "C____ D______" };
        int[] votes = { 751, 496, 303, 225, 81 };
        int j = names.length;
        Candidate[] candidates = new Candidate[j];
        System.out.println(" Raw Election Data:");
        candidates = createCandidatesArray(names, votes);

        System.out.println("Original Results:\n");
        printArrayOfElectionResults(candidates, votes);

        updateNameOfCandidateArray(candidates, "Bruce Banner", "Stan Lee");

        System.out.println("<< Changing Bruce Banner to Stan Lee >>\n");
        printArrayOfElectionResults(candidates, votes);

        updateCandidateVotesArray(candidates, "Henry Pym", votes, 284);

        System.out.println("\n\n<< Changing Henry Pym votes to 284 >>\n");
        printArrayOfElectionResults(candidates, votes);

    }
}