// Purpose of Project: To list the results of the election
// Version/Date: 02/09/2023
// Author: Tejas Upadhyay

import java.util.ArrayList;

public class ElectionTesterV4V3 {
    public static void printArrayOfCadidates(ArrayList<Candidate> candidates, int totalVotes) {
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

    public static void addCandidatesToArrayList(ArrayList<Candidate> candidates) {
        // ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Tony Stark", 751));
        candidates.add(new Candidate("Henry Pym", 496));
        candidates.add(new Candidate("Bruce Banner", 303));
        candidates.add(new Candidate("S____ R_____", 225));
        candidates.add(new Candidate("C____ D______", 81));
    }

    public static void updateNameOfCandidateArrayList(ArrayList<Candidate> candidates, String oldName, String newName) {
        // Changing Bruce Banner to Stan Lee
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                System.out.println(candidate.toString());
            }
        }
    }

    public static void updateCandidateVotesArray(ArrayList<Candidate> candidates, String targetName, int newVoteCount) {
        // Changing Henry Pym votes to 284
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(targetName)) {
                candidate.setVotes(newVoteCount);
                System.out.println(candidate.toString());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();

        addCandidatesToArrayList(candidates);

        System.out.println("Original Results:\n");
        printArrayListOfElectionResults(candidates);

        updateNameOfCandidateArrayList(candidates, "Bruce Banner", "Stan Lee");

        System.out.println("<< Changing Bruce Banner to Stan Lee >>\n");
        printArrayListOfElectionResults(candidates);

        updateCandidateVotesArray(candidates, "Henry Pym", 284);

        System.out.println("\n\n<< Changing Henry Pym votes to 284 >>\n");
        printArrayListOfElectionResults(candidates);

    }

}