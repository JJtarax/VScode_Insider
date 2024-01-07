import java.util.concurrent.CountDownLatch;

import javax.lang.model.util.ElementScanner14;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        String[] mascots = { "Knights", "Seminoles", "Bulls", "Gators" };
        int n = -1;
        String str = "";

        for (String m : mascots) {
            n = m.indexOf("i") + 2;
            str += m.substring(n);
        }
        System.out.println(str);
    }
}