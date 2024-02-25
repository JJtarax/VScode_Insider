
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

	public static void addNewStudentToClassList(ArrayList<student> studentList) {

		Scanner in = new Scanner(System.in);
		// Get the student's first and last name
		System.out.println("What is the student's first name?");
		String fName = in.nextLine();
		System.out.println("What is the student's last name?");
		String lName = in.nextLine();
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
	}

	public static void updateNameOfStudentArrayList(ArrayList<student> studentList) {
		// Changing Bruce Banner to Stan Lee
		Scanner in = new Scanner(System.in);
		// Get the student's first and last name
		System.out.println("What is the name of student that name you want to change?");
		System.out.println("What is the student's first name?");
		String fName = in.next();
		System.out.println("What is the student's last name?");
		String lName = in.next();
		String name = formatName(fName, lName);

		System.out.println("What should the name of the student be?");
		System.out.println("What is the student's first name?");
		String newFirstName = in.next();
		System.out.println("What is the student's last name?");
		String newLastName = in.next();

		for (student students : studentList) {
			if (students.getFullName().equals(name)) {
				students.setFullName(newFirstName, newLastName);
				// System.out.println(studentList.toString());
			}
		}
	}

	public static void updateQuizScoreOfStudentArrayList(ArrayList<student> studentList) {
		Scanner in = new Scanner(System.in);
		// Get the student's first and last name
		System.out.println("What is the name of student that you want to change?");
		System.out.println("\tWhat is the student's first name?");
		String fName = in.next();
		System.out.println("\tWhat is the student's last name?");
		String lName = in.next();
		String name = formatName(fName, lName);

		System.out.println("Do you want to change all of his quiz scores or only one? (all/one)");
		String wasd = in.next();

		if (wasd.equals("all")) {
			for (student students : studentList) {
				if (students.getFullName().equals(name)) {
					for (int i = 1; i <= 5; i++) {
						System.out.print("Q" + i + ": \n");
						int newQuizScore = in.nextInt();
						students.setQuizScore(i, newQuizScore);
						// System.out.println(studentList.toString());
					}
				}
			}
		} else if (wasd.equalsIgnoreCase("one"))

		{
			System.out.println("Which quiz score would you like to change?");
			int i = in.nextInt();
			for (student students : studentList) {
				if (students.getFullName().equals(name)) {
					System.out.print("Q" + i + ": \n");
					int newQuizScore = in.nextInt();
					students.setQuizScore(i, newQuizScore);
					// System.out.println(studentList.toString());
				}
			}
		}
	}

	public static void removeStudentFromArrayList(ArrayList<student> studentList) {

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