import java.util.Scanner;
import java.util.ArrayList;

public class tester {
	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		ArrayList<Integer> studentGrades = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		String addMore = "yes";
		int students = 0;

		while (addMore.equalsIgnoreCase("YES")) {
			System.out.println("What is the students first name?");
			String fName = in.nextLine();
			System.out.println("What is the Students last name?");
			String lName = in.nextLine();
			String name = fName + " " + lName;
			studentNames.add(name);

			System.out.println("Would you like to add more?");
			addMore = in.nextLine().toLowerCase();
			while (!addMore.equalsIgnoreCase("yes") && !addMore.equalsIgnoreCase("no")) {
				System.out.println("Write either 'yes' or 'no'");
				System.out.println("Would you like to add more?");
				addMore = in.nextLine().toLowerCase();
			}
			students++;
		}
		System.out.println(students);
		in.close();
	}
}
