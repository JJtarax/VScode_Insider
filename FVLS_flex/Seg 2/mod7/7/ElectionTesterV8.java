
/*
 * To display the votes of the election
 * 
 * @author Tejas Upadhyay
 * @version Januray __ 2024
 */
import java.util.ArrayList;

public class ElectionTesterV8 {
    public class ElectionTesterV4V3 {
        public static void printArrayOfCadidates(ArrayList<Candidate> candidates, int totalVotes) {
            for (Candidate candidate : candidates) {
                float percentVotes = ((float) candidate.getVotes() / totalVotes) * 100;
                if (percentVotes < 10.0 || candidate.getVotes() <= 99.0) {
                    if (percentVotes < 10.0 || candidate.getVotes() <= 99.0) {
                        System.out.printf("%-22s %-18d %.2f \n", candidate.getName(), candidate.getVotes(),
                                percentVotes);
                    } else if (candidate.getVotes() < 100.0) {
                        System.out.printf("%-22s %-18d %.2f \n", candidate.getName(), candidate.getVotes(),
                                percentVotes);
                    } else if (percentVotes < 10.0) {
                        System.out.printf("%-21s %-19d %.2f \n", candidate.getName(), candidate.getVotes(),
                                percentVotes);
                    }
                } else {
                    System.out.printf("%-21s %-18d %.2f \n", candidate.getName(), candidate.getVotes(), percentVotes);
                }
            }
        }

        public static void printArrayListOfElectionResults(ArrayList<Candidate> candidates) {
            System.out.print("""
                                         Votes           % of Total
                    Candidate           Received            Votes
                    ===============================================
                                """);

            int totalVotes = 0;
            for (Candidate candidate : candidates) {
                totalVotes += candidate.getVotes();
            }

            printArrayOfCadidates(candidates, totalVotes);

            System.out.println("\nThe total number of votes is: " + totalVotes);

        }

        public static void removeCandidateByNameArrayList(ArrayList<Candidate> candidates, String targetName) {
            // Changing Henry Pym votes to 284
            for (int i = 0; i < candidates.size(); i++) {
                if (candidates.get(i).getName().equals(targetName)) {

                    candidates.remove(i);
                }
            }
        }

        public static void addCandidatesToArrayList(ArrayList<Candidate> candidates) {
            candidates.add(new Candidate("Tony Stark", 751));
            candidates.add(new Candidate("Henry Pym", 496));
            candidates.add(new Candidate("Bruce Banner", 303));
            candidates.add(new Candidate("S____ R_____", 225));
            candidates.add(new Candidate("C____ D______", 451));
            candidates.add(new Candidate("P______ P____", 634));
            candidates.add(new Candidate("P___ C______", 235));
            candidates.add(new Candidate("M____ H___set", 204));
        }

        public static void main(String[] args) {
            ArrayList<Candidate> candidates = new ArrayList<>();

            addCandidatesToArrayList(candidates);

            System.out.println("Original Results:\n");
            printArrayListOfElectionResults(candidates);

            candidates.remove(4);

            System.out.println("<< Removing 4th position >>\n");
            printArrayListOfElectionResults(candidates);

            removeCandidateByNameArrayList(candidates, "Henry Pym");

            System.out.println("\n\n<< Deleting Henry Pym >>\n");
            printArrayListOfElectionResults(candidates);

        }

    }
}
