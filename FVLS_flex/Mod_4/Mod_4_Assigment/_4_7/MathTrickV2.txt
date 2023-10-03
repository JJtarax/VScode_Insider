package FVLS_flex.Mod_4.Mod_4_Assigment._4_7;

public class MathTrick {

	// Generate a 3-digit numer at rnadom with a difference of 1 with the first and
	// last digits
	public static int getRandomNum() {
		int num = 0;
		int diff = 0;
		while (diff < 1) {
			num = (int) (Math.random() * 999 - 100) + 100; // Generates a random 3-digit number
			int firstDigit = num / 100;
			int lastDigit = num % 10;
			diff = Math.abs(firstDigit - lastDigit);
		}
		return num;
	}

	// reverses the 3 randomly digits
	public static int reverseDigits(int num) {
		int reversedNum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			reversedNum = (reversedNum * 10) + lastDigit;
			num /= 10;
		}
		return reversedNum;
	}

	// replaces the reversed digits with letters
	public static String replaceLtr(String str) {
		String strResult = "";
		for (int i = 0; i < str.length(); i++) {
			// get char
			String digit = str.substring(i, (i + 1));

			// replace [0-9] with [alph]
			if (digit.equals("0")) {
				strResult = strResult.concat("Y");
			} else if (digit.equals("1")) {
				strResult = strResult.concat("M");
			} else if (digit.equals("2")) {
				strResult = strResult.concat("P");
			} else if (digit.equals("3")) {
				strResult = strResult.concat("L");
			} else if (digit.equals("4")) {
				strResult = strResult.concat("R");
			} else if (digit.equals("5")) {
				strResult = strResult.concat("O");
			} else if (digit.equals("6")) {
				strResult = strResult.concat("F");
			} else if (digit.equals("7")) {
				strResult = strResult.concat("A");
			} else if (digit.equals("8")) {
				strResult = strResult.concat("I");
			} else if (digit.equals("9")) {
				strResult = strResult.concat("B");
			}
		}
		return strResult;
	}

	// reveres the letters
	public static String reverseString(String str) {
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr.concat(str.substring(i, i + 1));
		}
		return reversedStr;
	}

	// print
	public static void main(String[] args) {
		int num1 = getRandomNum();
		System.out.println("1. The starting number: : " + num1);

		int num2 = reverseDigits(num1);
		System.out.println("2. The reversed number: " + num2);

		int difference = Math.abs(num1 - num2);
		System.out.println("3. The difference is: " + difference);

		int num3 = reverseDigits(difference);
		System.out.println("4. The reversed number added to differnce: " + num3);

		long result = (long) num3 * 1000000L;
		System.out.println("5. Number x one million: " + result);

		long numSubtract = result - 733361573L;
		System.out.println("6. Number subtraced and converted to String: " + numSubtract);

		String strResult = String.valueOf(numSubtract);
		String replacedStr = replaceLtr(strResult);
		System.out.println("7. Replaced string: " + replacedStr);

		String reversedMessage = reverseString(replacedStr);
		System.out.println("8. Reversed string: " + reversedMessage);
	}
}
