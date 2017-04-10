import java.util.Scanner;

public class magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a 5 letter word: ");
		
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		char firstLetter = input.charAt(0);
		char secondLetter = input.charAt(1);
		char thirdLetter = input.charAt(2);
		char fourthLetter = input.charAt(3);
		char fifthLetter = input.charAt(4);
		
		System.out.println(firstLetter);
		System.out.println(firstLetter + "" + secondLetter);
		System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter);
		System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter + "" + fourthLetter);
		System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter + "" + fourthLetter + "" + fifthLetter);
	}

}
