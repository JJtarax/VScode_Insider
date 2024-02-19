import java.util.Arrays;

public class main {
    private String firstName;
    private String lastName;
    private int[] quizScores;

    // Constructor
    public main(String firstName, String lastName, int[] quizScores) {
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
