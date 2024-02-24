import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {
        // Create ArrayLists to store student data
        ArrayList<student> studentList = new ArrayList<>();
        student student1 = new student("Tejas", "Upadhayay");
        student student2 = new student("Dave", "leader");
        student student3 = new student("Jack", "Bond");
        student student4 = new student("Jeffery", "pineable");
        student student5 = new student("ThisIsToSeeHowLongCharaterLimt", "cambell");

        // Add students to the ArrayList
        studentList.addAll(Arrays.asList(student1, student2, student3, student4, student5));

        for (student student : studentList) {
            for (int i = 1; i < 6; i++) {
                int randNum = 10 + (int) (Math.random() * ((99 - 10) + 1));
                student.setQuizScore(i, randNum);
            }
        }

        // Create a Scanner object to get input from the user
        Scanner in = new Scanner(System.in);
        // Initialize a variable to store the user's response
        System.out.println("\n");
        student.studentPrint(studentList);
        System.out.println("""
            
                Please select an option:

                1 : Add a new student
                2 : Change an existing student's name
                3 : Change an existing student's quiz scores
                4 : Remove a student
                5 : Quit
                """);

        String request = in.nextLine();

        // Loop until the user says no to adding more students
        while (!request.equalsIgnoreCase("5")) {

            switch (request) {
                case "1": // Add a new Student
                    studentList = student.addNewStudentToClassList(studentList);
                    break;
                case "2": // Change an existing student's name

                    break;
                case "3": // Change an existing student's quiz score

                    break;
                case "4": // Remove a student

                    break;
                default:
                    System.out.println("Bad input recieved! Exiting ...");
                    return;
            }

            student.studentPrint(studentList);
            System.out.println("""

                    Please select an option:

                    1 : Add a new student
                    2 : Change an existing student's name
                    3 : Change an existing student's quiz scores
                    4 : Remove a student
                    5 : Quit
                    """);

            request = in.nextLine();
            in.close();
        }
    }
}
