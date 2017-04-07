import java.util.Scanner;

public class magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		String input1 = "input";
		char firstLetter = input1.charAt(0);
		char secondLetter = input1.charAt(1);
		char thirdLetter = input1.charAt(2);
		char fourthLetter = input1.charAt(3);
		char fifthLetter = input1.charAt(4);
		
		System.out.print("Enter the word: ");
		System.out.println(input);
		System.out.println(firstLetter);
		System.out.println(secondLetter);
		System.out.println(thirdLetter);
		System.out.println(fourthLetter);
		System.out.println(fifthLetter);
	}

}
