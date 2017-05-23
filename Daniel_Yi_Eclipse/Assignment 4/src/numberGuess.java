import java.util.Scanner;
import java.util.Random;
public class numberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner (System.in);
		Random rNumber = new Random ();
		int randomNumber;
		randomNumber = rNumber.nextInt(100)+1;
		System.out.println("Put in a guess");
		int firstAnswer;
		firstAnswer = userInput.nextInt();
if (firstAnswer>randomNumber){
		System.out.println("Number is to large, guess a smaller number.");
}
		if(firstAnswer<randomNumber){	
			System.out.println("Number is to small, guess a larger number.");
		}		
				if (firstAnswer==randomNumber);{
					System.out.println("You guessed the number right.");
					
		
		}

		System.out.println("Put in a second guess");
		int secondAnswer;
		secondAnswer = userInput.nextInt();
		

		System.out.println("Put in a third guess");
		int thirdAnswer;
		thirdAnswer = userInput.nextInt();
		
		
	}

}
