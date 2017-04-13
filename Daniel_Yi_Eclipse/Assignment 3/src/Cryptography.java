import java.util.Scanner;
public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the five word sentence: ");
		
		Scanner keyboard = new Scanner (System.in);
		//first word
		String input = keyboard.next(); 
		char firstLetter = input.charAt(0);
		//second word
		String secondInput = keyboard.next(); 
		char wordAfterH = secondInput.charAt(1);
		//third word
		String thirdInput = keyboard.next(); 
		thirdInput = thirdInput.toLowerCase(); 
		char middle = thirdInput.charAt(thirdInput.length()/2);
		//fourth word
		String fourthInput = keyboard.next(); 
		//fifth word
		String fifthInput = keyboard.next(); 
		//last letter of fourth word
		String lastLetter = fourthInput.substring(fourthInput.length()-1);
		//second last letter of fifth word
		String secondLastLetter = fifthInput.substring(fifthInput.length()-2);
		char lastLetterChar = secondLastLetter.charAt(0);
		
		System.out.print(firstLetter);
		System.out.print(wordAfterH);
		System.out.print(middle);
		System.out.print(lastLetter);
		System.out.print(lastLetterChar);
	}

}
