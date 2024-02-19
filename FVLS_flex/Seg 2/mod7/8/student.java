import java.util.ArrayList;
import java.util.Scanner;

public class student {
	public void studentPrint(ArrayList<String> studentNames, ArrayList<Integer> q1, ArrayList<Integer> q2,
			ArrayList<Integer> q3, ArrayList<Integer> q4, ArrayList<Integer> q5) {
		// Print out the headers for the table
		System.out.println("Name\t\tQ1\tQ2\tQ3\tQ4\tQ5");
		// Loop through the ArrayLists and print out the data for each student
		for (int j = 0; j < studentNames.size(); j++) {
			System.out.printf("%-16s %-7d %%-7d %%-7d %%-7d %%-7d%n",
					studentNames.get(j), q1.get(j), q2.get(j), q3.get(j), q4.get(j), q5.get(j));
		}
	}

	public static void main(String[] args) {
		// Create ArrayLists to store student data
		ArrayList<main> main = new ArrayList<>();
		student student = new student();
		ArrayList<String> studentNames = new ArrayList<>();
		ArrayList<Integer> q1 = new ArrayList<>();
		ArrayList<Integer> q2 = new ArrayList<>();
		ArrayList<Integer> q3 = new ArrayList<>();
		ArrayList<Integer> q4 = new ArrayList<>();
		ArrayList<Integer> q5 = new ArrayList<>();

		// Create a Scanner object to get input from the user
		Scanner in = new Scanner(System.in);
		// Initialize a variable to store the user's response
		String addMore = "yes";

		// Loop until the user says no to adding more students
		while (addMore.equalsIgnoreCase("yes")) {
			// Get the student's first and last name
			System.out.println("What is the student's first name?");
			String fName = in.next();
			System.out.println("What is the student's last name?");
			String lName = in.next();
			String name = fName + " " + lName;
			// Add the student's name to the ArrayList
			studentNames.add(name);

			// Get the student's grades
			System.out.println("Enter the grades for " + name + ":");
			System.out.print("q1: ");
			q1.add(in.nextInt());
			System.out.print("q2: ");
			q2.add(in.nextInt());
			System.out.print("q3: ");
			q3.add(in.nextInt());
			System.out.print("q4: ");
			q4.add(in.nextInt());
			System.out.print("q5: ");
			q5.add(in.nextInt());

			// Ask the user if they want to add more students
			System.out.println("Would you like to add more students? (yes/no)");
			addMore = in.next().toLowerCase();
			// Check if the user's response is valid
			while (!addMore.equals("yes") && !addMore.equals("no")) {
				System.out.println("Please enter 'yes' or 'no':");
				addMore = in.next().toLowerCase();
			}
		}

		// Calculate average grades and display results
		student.studentPrint(studentNames, q1, q2, q3, q4, q5);
		// Close scanner
		in.close();
	}
}