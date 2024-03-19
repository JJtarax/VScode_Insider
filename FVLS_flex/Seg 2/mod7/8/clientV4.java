
/**
 * Purpose: To display the grades of students in a class
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

public class clientV4 {
    public static void main(String[] args) {
        // Create ArrayLists to store student data
        ArrayList<studentV4> studentList = new ArrayList<>();
        studentV4 student1 = new studentV4("Tejas", "Upadhyay");
        studentV4 student2 = new studentV4("Dave", "Leader");
        studentV4 student3 = new studentV4("Jack", "Bond");
        studentV4 student4 = new studentV4("Jeffery", "Pineable");
        studentV4 student5 = new studentV4("ThisIsToSeeHowLongCharaterLimt", "Cambell");

        // Add students to the ArrayList
        studentList.addAll(Arrays.asList(student1, student2, student3, student4, student5));

        for (studentV4 student : studentList) {
            for (int i = 1; i < 6; i++) {
                int randNum = 10 + (int) (Math.random() * ((99 - 10) + 1));
                student.setQuizScore(i, randNum);
            }
        }

        // Create a Scanner object to get input from the user
        // Initialize a variable to store the user's response
        System.out.println("\n");
        studentV4.studentPrint(studentList);
        // System.out.println("""

        // Please select an option:

        // 1 : Add a new student
        // 2 : Change an existing student's name
        // 3 : Change an existing student's quiz scores
        // 4 : Change an existing student with a new student
        // 5 : Remove a student
        // 6 : Quit
        // """);

        int request = 1;
        // Loop until the user says no to adding more students
        while (request != 6) {
            if (request == 1) {
                System.out.println("Adding a new student named Chris Rock");
                studentV4.addNewStudentToClassList(studentList, "Chris", "Rock");
            } else if (request == 2) {
                System.out.println("Changing an Jack Bond's name to James Bond");
                studentV4.updateNameOfStudentArrayList(studentList, "Jack Bond", "James", "Bond");
            } else if (request == 3) {
                System.out.println("Changing ThisIsToSeeHowLongCharaterLimt Cambels's quiz scores");
                studentV4.updateQuizScoreOfStudentArrayList(studentList, "ThisIsToSeeHowLongCharaterLimt", "Cambell",
                        1);
            } else if (request == 4) {
                System.out.println("Changing Jeffery Pineable's quiz scores");
                studentV4.updateQuizScoreOfStudentArrayList(studentList, "Jeffery", "Pineable", 2);
                // } else if (request == 5) {
                // studentV2.removeStudentFromArrayList(studentList);
            } else if (request == 5) {
                System.out.println("Changing Jeffery Pineable's quiz scores and name with Drake Full");
                studentV4.replaceStudentInArrayList(studentList, "Jeffery", "Pineable", "Drake", "Full");
            } else {
                // System.out.println("Invalid input. Please try again.");
                return;
            }
            System.out.println("\n");
            studentV4.studentPrint(studentList);
            System.out.println("\n");

            request++;
        }
        System.out.println("Goodbye!");
    }
}
