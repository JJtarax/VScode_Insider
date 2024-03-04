// Purpose of Project: To list the results of the election
// Version/Date: 02/09/2023
// Author: Tejas Upadhyay

import java.util.ArrayList;

public class ElectionTesterV7 {

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

            if (candidate.getVotes() < 100.0) {
                System.out.printf("%-22s %-18d %.2f \n", candidate.getName(), candidate.getVotes(),
                        percentVotes);
            } else if (percentVotes < 10.0) {
                System.out.printf("%-21s %-19d %.2f \n", candidate.getName(), candidate.getVotes(),
                        percentVotes);
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

    public static Candidate[] removeCandidateByNameArray(Candidate[] candidates, String targetName) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(targetName)) {

                candidates = removeCandidateByPositionArray(candidates, i);
            }
        }
        return candidates;
    }

    public static Candidate[] removeCandidateByPositionArray(Candidate[] array, int index) {
        // Create another array of size one less
        Candidate[] anotherArray = new Candidate[array.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < array.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = array[i];
        }

        // return the resultant array
        return anotherArray;
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
        String[] names = {
                "Tony Stark",
                "Henry Pym",
                "Bruce Banner",
                "S____ R_____",
                "C____ D______",
                "P______ P____",
                "P___ C______",
                "M_____ H___" };
        int[] votes = {
                751,
                496,
                303,
                225,
                451,
                634,
                235,
                204 };
        int x = names.length;
        Candidate[] candidates = new Candidate[x];
        System.out.println(" Raw Election Data:");
        candidates = createCandidatesArray(names, votes);

        System.out.println("Original Results:\n");
        printArrayOfElectionResults(candidates, votes);

        candidates = removeCandidateByPositionArray(candidates, 4);

        System.out.println("<< Remove 4th position >>\n");
        printArrayOfElectionResults(candidates, votes);

        candidates = removeCandidateByNameArray(candidates, "Henry Pym");

        System.out.println("\n\n<< Deleting Henry Pym >>\n");
        printArrayOfElectionResults(candidates, votes);

    }

}