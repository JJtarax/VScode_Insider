import java.util.Scanner;

public class tester {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

	System.out.println("Hello");

    String word = "moonlight";
    String x = word.substring(4);
    String y = word.substring(4, 8);
    if( x == y)
        System.out.print(1);
    else if( x.equals(y))
        System.out.print(2);
    else
        System.out.print(3);

    }

}
