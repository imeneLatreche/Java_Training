import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		// Getting the sentence from the user
		System.out.println("Please enter a sentence");
		Scanner input = new Scanner (System.in);
		String sentence = input.nextLine();
		input.close();

		if (isPalindrome(sentence))
			System.out.print(sentence+ " is a palindrome");
		else
			System.out.print(sentence+ " is not a palindrome");
	}

	// Function that returns true if sentence is a palindrome
	static boolean isPalindrome(String str) {

		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
