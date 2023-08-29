package FVLS_flex.Mod_4.Mod_4_Assigment._4_7;

/**
 * 
 * @author FLVS AP CSA team
 * @version 2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

 public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		// complete the method		

		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
	
		// complete the method
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
		// complete the method		
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		// complete the method
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.

//		2.	Now reverse the digits to form a second number.

//		3.	Subtract the smaller number from the larger one.

//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.

//		5.	Multiply by one million.

//		6.	Subtract 733,361,573.

//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.

//		8.	Now reverse the letters in the string to read your message backward.

	} // end main
} // end class