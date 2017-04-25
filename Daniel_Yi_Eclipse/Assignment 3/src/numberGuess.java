import java.util.Scanner;
import java.util.Random;

public class numberGuess {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner (System.in);
		Random r1 = new Random();
		
		int firstDigit = r1.nextInt(101);
		
		boolean question1 = (firstDigit>50);
		boolean question2 = (firstDigit%5==0 && (firstDigit%10!=0) || (firstDigit/10>4.9) || (firstDigit/10<6));
		boolean question3;
		
		System.out.print(firstDigit);
		System.out.println("Number greater than 50? " + question1);
	        System.out.println("Number has a five: " + question2);					
	}
}
