import java.util.Scanner;
import java.util.Random;

public class numberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner and Random integer generator
		Scanner keyboard= new Scanner (System.in);
		Random r1 = new Random();
		
		//int of random generated number
		int firstDigit = r1.nextInt(101);

		//Boolean for true and false statements for each hints
		boolean question1 = (firstDigit>50);
		boolean question2 = (firstDigit%5==0 && (firstDigit%10!=0) || (firstDigit/10>4.9) || (firstDigit/10<6));
		boolean question3;
		boolean even = firstDigit%2==0;
		
		System.out.println("Number is even: " + even);
		System.out.println("Number greater than 50: " + question1);
	    System.out.println("Number has a five: " + question2);			
	    System.out.print("Enter your guess: ");
	    
	    //int for Scanner
	    int guess = keyboard.nextInt();
	    
		System.out.println("The number: " + firstDigit);
		
		
		
		
	}

}
