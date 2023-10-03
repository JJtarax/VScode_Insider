public class StudentV8 {
    private String myStudentName;
    private int myGrade1;
    private int myGrade2;

    // Default conscuter
    public StudentV8() {
        myStudentName = "";
        myGrade1 = 0;
        myGrade2 = 0;
    }

    // overloaded conscuter to set value
    public StudentV8(String studentName, int grade1, int grade2) {
        myStudentName = studentName;
        myGrade1 = grade1;
        myGrade2 = grade2;
    }

    // Get Student name
    public String getStudentName() {
        return myStudentName;
    }

    // Set Student name
    public void setStudentName(String studentName) {
        this.myStudentName = studentName;
    }

    // Get Grade 1
    public int getGrade1() {
        return myGrade1;
    }

    // Set Grade 1
    public void setGrade1(int grade1) {
        this.myGrade1 = grade1;
    }

    // Get Grade 2
    public int getGrade2() {
        return myGrade2;
    }

    // Set Grade 2
    public void setGrade2(int grade2) {
        this.myGrade2 = grade2;
    }

    // Calucate Average Grade
    public float averageValue() {
        return (float) ((myGrade1 + myGrade2) / 2.0);
    }
}