import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Student class definition
class Student {
    private String firstName;
    private String lastName;
    private int[] quizScores;

    // Constructor
    public Student(String firstName, String lastName, int[] quizScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.quizScores = quizScores;
    }

    // Method to get quiz score by quiz number
    public int getQuizScore(int quizNumber) {
        return quizScores[quizNumber - 1];
    }

    // Method to set quiz score by quiz number
    public void setQuizScore(int quizNumber, int score) {
        quizScores[quizNumber - 1] = score;
    }

    // Getter for student name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Setter for student name
    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // toString method to print student information
    @Override
    public String toString() {
        return firstName + " " + lastName + " Quiz Scores: " + Arrays.toString(quizScores);
    }
}

// Client class to test Student class and perform operations on students
public class GradeBook {
    private List<Student> students;

    // Constructor
    public GradeBook() {
        students = new ArrayList<>();
    }

    // Method to add a student to the grade book
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to traverse and print all students in the grade book
    public void printStudents() {
        System.out.println("Students in the Grade Book:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to replace a student's name with a new one
    public void replaceStudentName(String oldName, String newFirstName, String newLastName) {
        for (Student student : students) {
            if (student.getFullName().equals(oldName)) {
                student.setFullName(newFirstName, newLastName);
                break;
            }
        }
    }

    // Method to replace a student's quiz grade with a new one
    public void replaceQuizGrade(String fullName, int quizNumber, int newGrade) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                student.setQuizScore(quizNumber, newGrade);
                break;
            }
        }
    }

    // Method to replace a student with another one
    public void replaceStudent(String oldName, String newFirstName, String newLastName, int[] newQuizScores) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFullName().equals(oldName)) {
                students.set(i, new Student(newFirstName, newLastName, newQuizScores));
                break;
            }
        }
    }

    // Method to insert a new student before another student
    public void insertStudentBefore(String existingName, String newFirstName, String newLastName, int[] newQuizScores) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFullName().equals(existingName)) {
                students.add(i, new Student(newFirstName, newLastName, newQuizScores));
                break;
            }
        }
    }

    // Method to delete a student by name
    public void deleteStudent(String fullName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFullName().equals(fullName)) {
                students.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Test the GradeBook class
        GradeBook gradeBook = new GradeBook();

        // Adding students with user input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter student last name:");
            String lastName = scanner.nextLine();
            int[] quizScores = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter quiz " + (j + 1) + " score:");
                quizScores[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
            gradeBook.addStudent(new Student(firstName, lastName, quizScores));
        }

        // Printing students
        gradeBook.printStudents();

        // Example usage of Scanner for user input
        System.out.println("Enter student name to replace:");
        String oldName = scanner.nextLine();
        System.out.println("Enter new first name:");
        String newFirstName = scanner.nextLine();
        System.out.println("Enter new last name:");
        String newLastName = scanner.nextLine();
        gradeBook.replaceStudentName(oldName, newFirstName, newLastName);
        gradeBook.printStudents();

        // Remember to close the scanner
        scanner.close();
    }
}