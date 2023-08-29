
/**
 * The purpose of this program is to read data from
 * an input file.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class familyMemebers
{
    public static void main(String[] args) throws IOException
    {

        String token = "";
        File fileName = new File("C:\\Users\\Jas Jtarax\\Desktop\\VScode_Insider\\FVLS_flex\\Mod_4\\Mod_4_Assigment\\_4_3\\test.txt");
        Scanner inFile = new Scanner(fileName);

        int BB = 0;
        int GG = 0;
        int GB_BG = 0;
        //while loop will continue while inFile has a next token to read
        while( inFile.hasNext() )
        {
            token = inFile.next( );      //read next token from file
            if (token.equals("BB")){
                BB++;
            }
            else if (token.equals("BB")){
                BB++;
            }
            else if (token.equals("GB")){
                GB_BG++;
            }
            else if (token.equals("BG")){
                GB_BG++;
            }
        }//end while
        inFile.close();                 //close input file

        System.out.println();

    }//end of main method
}//end of class


// V3: Use the following block of code to test reading integers from data3.txt
/*
      //String token = "";
      int intToken = 0;
      File fileName = new File("data3.txt");
      Scanner inFile = new Scanner(fileName);
      int total = 0;

      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         intToken = inFile.nextInt();      //read next token from file
         System.out.println(intToken);   //print value of token
         total += intToken;
      }//end while

      System.out.println("\nTotal: " + total);
      inFile.close();                 //close input file

 */

// V4: Use the following block of code to test reading doubles from data4.txt
/*
      String token = "";
      double doubleToken = 0.0;
      File fileName = new File("data4.txt");
      Scanner inFile = new Scanner(fileName);
      double total = 0;

      //while loop will continue while inFile has a next token to read
      while (inFile.hasNext())
      {
         doubleToken = inFile.nextDouble( );      //read next token from file
         System.out.println(doubleToken);   //print value of token
         total += doubleToken;
      }//end while

      System.out.println("\nTotal: " + total);
      inFile.close();                 //close input file
 */