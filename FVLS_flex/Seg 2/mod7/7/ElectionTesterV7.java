/*
 * To display the votes of the election
 * 
 * @author Tejas Upadhyay
 * @version Januray __ 2024
 */
public class ElectionTesterV7 {
    public static void printElectionResults(Candidate[] candidates, int[] votes) {

        System.out.print("""
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

    public static void removeCandidateByNameArray(Candidate[] candidates, String targetName) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(targetName)) {

                candidates = removeCandidateByPositionArray(candidates, i);
            }
        }
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
        // System.out.println(" Raw Election Data:");
        candidates = createCandidatesArray(names, votes);

        System.out.println("Original Results:\n");
        printElectionResults(candidates, votes);

        candidates = removeCandidateByPositionArray(candidates, 4);

        System.out.println("<< Remove 4th position >>\n");
        printElectionResults(candidates, votes);

        removeCandidateByNameArray(candidates, "Henry Pym");

        System.out.println("\n\n<< Deleting Henry Pym >>\n");
        printElectionResults(candidates, votes);

    }

}
