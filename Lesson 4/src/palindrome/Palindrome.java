import java.util.*; 


public class Palindrome {

	public static void findPalindrome (String x) {
		String reverse = "";
		int palinLength = x.length();
		for (int i=palinLength-1; i>=0;i--){
			reverse = reverse + x.charAt(i);
		}
		System.out.println(x);
		System.out.println(reverse);

		if (x.equals(reverse))
			System.out.println("Yes, it is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}

	public static void main(String[] args){
		System.out.print("Please enter a palindrome: ");
		Scanner input = new Scanner(System.in);
		String in = input.next();
		findPalindrome(in);
	}
}