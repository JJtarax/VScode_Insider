public class Contacts {
    private String name;
    private String relation;
    private String birthmonth;
    private int birthDay;
    private String phoneNumber;
    private String email;

    // Constructor for objects of class Music
    public Contacts(String n, String r, String m, int d, String p, String e) {
        // initialize instance variables
        this.name = n;
        this.relation = r;
        this.birthmonth = m;
        this.birthDay = d;
        this.phoneNumber = p;
        this.email = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        n = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String r) {
        r = relation;
    }

    public String getBirthMonth() {
        return birthmonth;
    }

    public void setBirthMonth(String m) {
        m = birthmonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int b) {
        b = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber(String p) {
        p = phoneNumber;
    }

    public String toString() {
        String str = String.format("%-25s %-20s %-10s %-5d %-15s %-20s", name, relation, birthmonth, birthDay,
                phoneNumber, email);
        return str;
    }
}
