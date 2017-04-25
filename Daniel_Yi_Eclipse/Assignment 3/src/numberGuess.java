import java.util.Scanner;
import java.util.Random;

public class numberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner keyboard= new Scanner (System.in);
		Random r1 = new Random();
		
		//int input = r1.nextInt(101);
		//int d1 = r1;
		//int question1 = 50;
		int firstDigit = r1.nextInt(101);
		
		System.out.print(firstDigit);
		
		
		if(firstDigit%5==0 && !(firstDigit%10==0) || (firstDigit==50)) {
			System.out.println("Number has a five: " + true);
		}// else if(firstDigit%5==0 && !(firstDigit%10==0)) {
			//System.out.print("Number has a five: " + true);
		//} else !((firstDigit%5==0) || (firstDigit%10==0)) {
		
	     //}
		
		
		
		
		//boolean finalFirstAnswer = answer1 && answer2; 
		//int nothing = 0;
		 
		
		
		
		
	}

}
