public class StudentTesterV8 {
    public static void main(String[] args) {
        StudentV8 John = new StudentV8("John", 85, 90);
        StudentV8 Alisa = new StudentV8("Alisa", 90, 92);
        StudentV8 Jessica = new StudentV8();

        System.out.print("""
                Student\t\t Grade 1\t Grade 2\t Average
                ========================================================
                """);

        System.out
                .println("  " + John.getStudentName() + "\t\t   " + John.getGrade1() + "\t\t   " + John.getGrade2()
                        + "\t\t  " + John.averageValue());

        System.out
                .println("  " + Alisa.getStudentName() + "\t\t   " + Alisa.getGrade1() + "\t\t   " + Alisa.getGrade2()
                        + "\t\t  " + Alisa.averageValue());

        Jessica.setStudentName("Jessica");
        Jessica.setGrade1(92);
        Jessica.setGrade2(84);
        System.out
                .println("  " + Jessica.getStudentName() + "\t   " + Jessica.getGrade1() + "\t\t   "
                        + Jessica.getGrade2()
                        + "\t\t  " + Jessica.averageValue());

    }
}