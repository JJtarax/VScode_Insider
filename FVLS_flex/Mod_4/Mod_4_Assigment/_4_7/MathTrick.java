public class MathTrick {
	public static int getRandomNum() {
		int num;
		do {
			num = (int) (Math.random() * 900) + 100; // Generates a random 3-digit number
			int firstDigit = num / 100;
			int lastDigit = num % 10;
			int diff = Math.abs(firstDigit - lastDigit);
			if (diff > 1) {
				break;
			}
		} while (true);
		return num;
	}

	public static int reverseDigits(int num) {
		int reversedNum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			reversedNum = (reversedNum * 10) + lastDigit;
			num /= 10;
		}
		return reversedNum;
	}

	public static String replaceLtr(String str) {
		StringBuilder replacedStr = new StringBuilder();
		for (char ch : str.toCharArray()) {
			switch (ch) {
				case '0':
					replacedStr.append('o');
					break;
				case '1':
					replacedStr.append('i');
					break;
				case '2':
					replacedStr.append('z');
					break;
				// Add more cases for other digits
				default:
					replacedStr.append(ch);
					break;
			}
		}
		return replacedStr.toString();
	}

	public static String reverseString(String str) {
		StringBuilder reversedStr = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr.append(str.charAt(i));
		}
		return reversedStr.toString();
	}

	public static void main(String[] args) {
		int num1 = getRandomNum();
		System.out.println("Step 1: Random 3-digit number: " + num1);

		int num2 = reverseDigits(num1);
		System.out.println("Step 2: Reversed number: " + num2);

		int difference = Math.abs(num1 - num2);
		System.out.println("Step 3: Difference: " + difference);

		int num3 = reverseDigits(difference);
		System.out.println("Step 4: Reversed difference: " + num3);

		long result = (long) num3 * 1000000L;
		System.out.println("Step 5: Multiplied by one million: " + result);

		long finalResult = result - 733361573L;
		System.out.println("Step 6: Subtracted 733,361,573: " + finalResult);

		String strResult = String.valueOf(finalResult);
		String replacedStr = replaceLtr(strResult);
		System.out.println("Step 7: Replaced digits with letters: " + replacedStr);

		String reversedMessage = reverseString(replacedStr);
		System.out.println("Step 8: Reversed message: " + reversedMessage);
	}
}
