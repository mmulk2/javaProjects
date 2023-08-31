import java.util.*; 


public class Palindrome {
	public static void main(String[] args){
		System.out.print("Please enter a palindrome: ");
		Scanner input = new Scanner(System.in);
		String in = input.next();
		String reverse = "";
		int palinLength = in.length();
		for (int i=palinLength-1; i>=0;i--){
			reverse = reverse + in.charAt(i);
		}
		System.out.println(in);
		System.out.println(reverse);

		if (in.equals(reverse))
			System.out.println("Yes, it is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
}