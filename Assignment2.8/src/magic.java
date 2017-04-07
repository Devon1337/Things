import java.util.Scanner;

public class magic {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		
		char[] letters = new char[input.length()];
		
		String TotalPrint = "";
		
		System.out.print("Enter the word: ");
		
		System.out.println(input);
		
		for(int x = 0; x < input.length(); x++) {
			letters[x] = input.charAt(x);
			TotalPrint = TotalPrint + letters[x];
			System.out.println(TotalPrint);
		}
	}
}
