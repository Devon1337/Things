import java.util.Scanner;

public class thirteenLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the word: ");
		Scanner keyboard = new Scanner (System.in); 
		String input = keyboard.nextLine();
		
		
		//location of letters and identifying letters
		int middleLetterNumb = input.length()/2;
		String lastThreeLetters = input.substring(input.length()-3);
		char secondLetter = input.charAt(1);
		char middleLetter = input.charAt(middleLetterNumb);
		char thirdLetter = input.charAt(2);
		
		
		
		System.out.println("The middle letter of you letter is " + "" + middleLetter);
		System.out.println("The last three letters of your word is: " + "" + lastThreeLetters);
		System.out.println("The second and third letters of your word is: " + "" + secondLetter + "" + thirdLetter);
		System.out.print("The word backwards is: ");
		
	

		for(int x=(input.length()-1); x > 0; x--) {
		
		System.out.print(input.charAt(x));
		}
		
		
	}

}
