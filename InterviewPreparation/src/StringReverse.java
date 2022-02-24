import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
		// Get the string from the user
		System.out.println("Please enter a string");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		input.close();
		
		// Reversing the string using StringBuilder class
		StringBuilder str = new StringBuilder();
		str.append(sentence);
		str.reverse();
		System.out.println(str);
		
	}
}
