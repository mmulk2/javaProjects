import java.util.Scanner;
public class Primarility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime;
		System.out.print("Please enter a prime integer number: ");
		Scanner input = new Scanner(System.in);
		prime = input.nextInt();
		if (prime == 1)
			System.out.println("The number you have entered is a prime number");
		else if (prime % 2 != 0)
			System.out.println("The number you have entered is a prime number");
		else
			System.out.println("The number you have entered is not a prime number!");

	}

}
