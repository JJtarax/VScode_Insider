public class m {
	private int[] myGrades;
	private String myName;

	public void m(int[] grades, String name) {
		this.myGrades = grades;
		this.myName = name;
	}

	public void setName(String name) {
		myName = name;
	}

	public String toString(int[] qGrades) {
		String string = String.format(myName, qGrades[0], qGrades[1], qGrades[2], qGrades[3]);
		return string;
	}
}
