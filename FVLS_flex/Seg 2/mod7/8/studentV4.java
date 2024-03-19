
/**
 * Purpose: To display the grades of students in a class
 *
 * @author @Tejas-Upadhyay
 * @version 2/25/2024
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class studentV4 {
	private String firstName;
	private String lastName;
	private int[] quizScores;

	// Constructor
	public studentV4(String firstName, String lastName) {
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

		String name = studentV4.getFullName(firstName, lastName);

		return name;
	}

	public static String getFullName(String firstName, String lastName) {
		String name = firstName + " " + lastName;

		if (firstName.length() == 11) {
			name = name.substring(0, 11);

		} else if (name.length() > 12) {
			name = name.substring(0, 12) + "...";
		}
		return name;
	}

	// Setter for student name
	public void setFullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// toString method to print student information
	public String toString() {
		return firstName + " " + lastName + " Quiz Scores: " + Arrays.toString(quizScores) + "\n";
	}

	public static void studentPrint(ArrayList<studentV4> studentList) {
		// Print out the headers for the table
		System.out.println("Student name\t Q1\tQ2\tQ3\tQ4\tQ5");
		System.out.println("----------------------------------------------------");
		// Loop through the ArrayLists and print out the data for each student
		for (studentV4 currentStudent : studentList) {
			System.out.printf("%-16s %-6d %-7d %-7d %-7d %-7d%n",
					currentStudent.getFullName(),
					currentStudent.getQuizScore(1),
					currentStudent.getQuizScore(2),
					currentStudent.getQuizScore(3),
					currentStudent.getQuizScore(4),
					currentStudent.getQuizScore(5));
		}
	}

	public static void addNewStudentToClassList(ArrayList<studentV4> studentList, String firstName, String lastName) {

		String name = firstName + " " + lastName;
		studentV4 Currentstudent = new studentV4(firstName, lastName);

		// if name to long then the formating of the table that is printed is weird
		if (name.length() > 14) {
			name = name.substring(0, 14) + ".";
		}
		// Add the student's name to the ArrayList
		studentList.add(Currentstudent);

		int input = 0;
		// Get the student's grades
		for (int i = 1; i < 6; i++) {
			input = (int) (Math.random() * 101);
			// System.out.println("Q" + i + ": " + input);
			Currentstudent.setQuizScore(i, input);
		}
	}

	public static void updateNameOfStudentArrayList(ArrayList<studentV4> studentList, String oldName,
			String newFirstName, String newLastName) {
		for (studentV4 students : studentList) {
			if (students.getFullName().equals(oldName)) {
				students.setFullName(newFirstName, newLastName);
				studentList.toString();
			}
		}
	}

	public static void updateQuizScoreOfStudentArrayList(ArrayList<studentV4> studentList, String firstName,
			String lastName, int option) {
		// Get the student's first and last name
		String name = formatName(firstName, lastName);

		if (option == 1) {
			for (studentV4 students : studentList) {
				if (students.getFullName().equals(name)) {
					for (int i = 1; i <= 5; i++) {
						int newQuizScore = (int) (Math.random() * 101);
						// System.out.print("Q" + i + ": " + newQuizScore + "\n");
						students.setQuizScore(i, newQuizScore);
					}

				}
			}
		} else if (option == 2) {
			// System.out.println("Which quiz score would you like to change?");
			int i = (int) (Math.random() * (5 - 1) + 1);
			for (studentV4 students : studentList) {
				if (students.getFullName().equals(name)) {
					// System.out.print("Q" + i + ": \n");
					int newQuizScore = (int) (Math.random() * 101);
					students.setQuizScore(i, newQuizScore);
				}
			}
		}
	}

	public static void replaceStudentInArrayList(ArrayList<studentV4> studentList, String oldfirstName,
			String oldlastName, String newFirstName, String newLastName) {
		// Assuming studentV3 is a class with appropriate constructor and methods
		// Create new student objects with the provided first and last names

		studentV4 newFirstStudent = new studentV4(newFirstName, newLastName);
		for (int i = 1; i <= 5; i++) {
			int newQuizScore = (int) (Math.random() * 101);
			// System.out.print("Q" + i + ": " + newQuizScore + "\n");
			newFirstStudent.setQuizScore(i, newQuizScore);
		}
		// Replace the old student objects in the list with the new ones
		int index = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getFullName().equals(studentV4.getFullName(oldfirstName, oldlastName))) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			studentList.set(index, newFirstStudent);
		} else {
			System.out.println("Student not found in the list.");
		}
	}

	public static void removeStudentFromArrayList(ArrayList<studentV4> studentList) {

		Scanner in = new Scanner(System.in);
		System.out.println("Which student would you like to remove?");
		System.out.println("\tWhat is their first name?");
		String firstName = in.next();
		System.out.println("\tWhat is their last name?");
		String lastName = in.next();
		String name = formatName(firstName, lastName);
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getFullName().equals(name)) {
				studentList.remove(i);
				System.out.println(studentList.toString());
			}
		}
		// int i = 0;
		// for (student students : studentList) {
		// if (students.getFullName().equals(name)) {
		// if (students.getFullName().equals(name)) {
		// studentList.remove(i);
		// System.out.println(studentList.toString());
		// }
		// i++;
	}

	public static String formatName(String firstName, String lastName) {
		String name = firstName + " " + lastName;

		if (firstName.length() == 11) {
			name = name.substring(0, 11);
		} else if (name.length() > 12) {
			name = name.substring(0, 12) + "...";
		}

		return name;
	}
}