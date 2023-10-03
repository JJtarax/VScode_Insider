public class StudentV3 {
    private int myGrade1;
    private int myGrade2;

    public StudentV3(int grade1, int grade2) {
        myGrade1 = grade1;
        myGrade2 = grade2;
    }

    public int grade1() {
        return myGrade1;
    }

    public int grade2() {
        return myGrade2;
    }

    public int averageValue() {
        return (grade1() + grade2()) / 2;
    }

    public int diff() {
        return Math.abs(grade1() - grade2());
    }

}