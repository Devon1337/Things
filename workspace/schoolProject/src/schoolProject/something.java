package schoolProject;
import java.util.Scanner;
import java.util.Random;
public class something {
	public static Scanner userInput = new Scanner (System.in);
	public static Random randomNumber = new Random();
	public static int total = 0;
	public static int remainder = 100;
	public static int userAnswer = userInput.nextInt();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name();
		System.out.println("Put in a number 3-13: ");
	}

	public static void totalPrints (){
		name();
	while(userAnswer>=3&&userAnswer<=13&&total<=100){
			int bot; 
			bot = randomNumber.nextInt(11)+3;
			total = total+bot;
			System.out.println("The Total is: " + total);
			
	}
		}
		
	public static void name (){
		totalPrints();
		//while(total<=100)
		userAnswer = userInput.nextInt();
			total = total+userAnswer;
	
	
	}
	
}
