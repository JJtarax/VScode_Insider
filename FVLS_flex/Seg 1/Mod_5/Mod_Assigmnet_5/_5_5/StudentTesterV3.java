public class StudentTesterV3 {
    public static void main(String[] args) {
        StudentV3 student1 = new StudentV3(90, 100);

        System.out.print("""
                Grade 1\t\t grade 2\t Average\t Differemce
                ===========================================================
                """);

        int grade1 = student1.grade1();
        System.out.print("  " + grade1);

        int grade2 = student1.grade2();
        System.out.print("\t\t   " + grade2);

        int average = student1.averageValue();
        System.out.print("\t\t  " + average);

        int diff = student1.diff();
        System.out.println("\t\t  " + diff);
    }
}