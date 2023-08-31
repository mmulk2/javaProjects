
package palindrome;
import java.util.Scanner;

public class palindrome {
	
	public static void main(String args[]){
		System.out.print("Please enter a palindrome: ");
		Scanner input = new Scanner(System.in);
		String in = input.next();
		boolean isRight = true;
		for (int i=0 ; i< in.length(); i++){
			for (int j = in.length() - 1; j >= 0 ; j--){
				if (in.charAt(j) == in.charAt(i) && i != j){
					isRight = true;
				}
				else
					isRight = false;
			}
			//isRight = true;
		}
			System.out.print(isRight);

	}

}
