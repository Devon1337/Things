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
		int Answer;
		Answer = userInput.nextInt();
		
		boolean gotIt = false;
		
		
		
			if (Answer>randomNumber&&!gotIt){
					System.out.println("Number is to large, guess a smaller number.");
					System.out.println("Put in a second guess");
			}
		
			if  (Answer<randomNumber&&!gotIt){	
					System.out.println("Number is to small, guess a larger number.");
					System.out.println("Put in a second guess");
			}
			if (Answer==randomNumber&&!gotIt){
					System.out.println("You guessed the number right.");
					gotIt=true;
			}
			if (!gotIt){
			Answer = userInput.nextInt();
			}
			
			if(Answer<randomNumber&&!gotIt){	
				System.out.println("Number is to small, guess a larger number.");
				System.out.println("Put in a third guess");
			}		
			if(Answer>randomNumber&&!gotIt){	
				System.out.println("Number is to large, guess a smaller number.");
				System.out.println("Put in a third guess");
			}
			if (Answer==randomNumber&&!gotIt){
					System.out.println("You guessed the number right.");
					gotIt=true;
			}
			
			
			if (!gotIt){
			Answer = userInput.nextInt();
			}

			if(Answer<randomNumber&&!gotIt){	
			System.out.println("Got Number Wrong.");
			}		
			
			if(Answer>randomNumber&&!gotIt){	
			System.out.println("Got Number Wrong.");
			}
			if (Answer==randomNumber&&!gotIt){
					System.out.println("You guessed the number right.");
					gotIt=true;
			}
		
	}

}


