import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {

		int number = 0;
		boolean prime = false;
		
		System.out.println("Please enter the number you want to check if it's a prime number");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			} else {
				prime = true;
			}
		}
		if (prime == true) {
			System.out.println(number+" is a prime number");
		} else {
			System.out.println(number+" is not a prime number");
		}

	}
}
