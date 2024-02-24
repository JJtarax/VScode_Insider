import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int[] quizScores;

	// Constructor
	public student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.quizScores = new int[5];
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
		String name = firstName + " " + lastName;

		if (firstName.length() == 13) {
			name = name.substring(0, 13);

		} else if (name.length() > 14) {
			name = name.substring(0, 14) + ".";
		}
		return name;
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

	public static void studentPrint(ArrayList<student> studentList) {
		// Print out the headers for the table
		System.out.println("Student name\t Q1\tQ2\tQ3\tQ4\tQ5");
		System.out.println("----------------------------------------------------");
		// Loop through the ArrayLists and print out the data for each student
		for (student currentStudent : studentList) {
			System.out.printf("%-16s %-6d %-7d %-7d %-7d %-7d%n",
					currentStudent.getFullName(),
					currentStudent.getQuizScore(1),
					currentStudent.getQuizScore(2),
					currentStudent.getQuizScore(3),
					currentStudent.getQuizScore(4),
					currentStudent.getQuizScore(5));
		}
	}

	public static ArrayList<student> addNewStudentToClassList(ArrayList<student> studentList) {

		Scanner in = new Scanner(System.in);
		// Get the student's first and last name
		System.out.println("What is the student's first name?");
		String fName = in.next();
		System.out.println("What is the student's last name?");
		String lName = in.next();
		String name = fName + " " + lName;
		student Currentstudent = new student(fName, lName);

		// if name to long then the formating of the table that is printed is weird
		if (name.length() > 14) {
			name = name.substring(0, 14) + ".";
		}
		// Add the student's name to the ArrayList
		studentList.add(Currentstudent);

		int input = 0;
		// Get the student's grades
		System.out.println("Enter the grades for " + name + ":");
		for (int i = 1; i < 6; i++) {
			System.out.print("q" + i + ": ");
			input = in.nextInt();
			Currentstudent.setQuizScore(i, input);
		}

		// Close scanner
		in.close();

		return studentList;
	}
}