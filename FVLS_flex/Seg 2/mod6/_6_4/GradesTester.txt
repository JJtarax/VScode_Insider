public class GradesTester {
    public static void print(GradesV1[] studentGrades) {
        System.out.println(
                """
                        \t\t\tQuiz Results
                        Students Name \t\tQuiz1 Grade \t\tQuiz2 Grade \t\tDifference \t\tAverage
                        =======================================================================================================""");

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.printf(studentGrades[i].toString() + "\t\t\t ");
            System.out.printf("%.2f\t\t\t", studentGrades[i].difference());
            System.out.printf("%.2f\n", studentGrades[i].Average());
        }
    }

    public static void main(String[] args) {

        GradesV1[] studentGrades = new GradesV1[4];

        studentGrades[0] = new GradesV1("Aaron", 92, 88);
        studentGrades[1] = new GradesV1("Blake", 78, 85);
        studentGrades[2] = new GradesV1("Jaqueline", 93, 80);
        studentGrades[3] = new GradesV1("Denise", 92, 95);

        print(studentGrades);
    }
}