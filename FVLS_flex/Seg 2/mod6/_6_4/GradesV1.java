public class GradesV1 {
    private int grades1;
    private int grades2;
    private String name;

    public GradesV1(String name, int grades1, int grades2) {
        this.name = name;
        this.grades1 = grades1;
        this.grades2 = grades2;
    }

    public String getName() {
        return name;
    }

    public void setName(String myName) {
        this.name = myName;
    }

    public int getGrades1() {
        return grades1;
    }

    public void setGrades1(int myGrades1) {
        this.grades1 = myGrades1;
    }

    public int getGrades2() {
        return grades2;
    }

    public void setGrades2(int myGrades2) {
        this.grades2 = myGrades2;
    }

    public double difference() {
        return grades2 - grades1;
    }

    public double Average() {
        return (grades1 + grades2) / 2.0;
    }

    // public String toString() {
    // if (name.length() > 6)
    // return name + "\t\t " + grades1 + "\t\t\t " + grades2;
    // else
    // return name + "\t\t\t " + grades1 + "\t\t\t " + grades2;
    // }
    public String toString() {
        return String.format("%-12s %5.2f", this.grades1, this.grades2);
    }
}
