import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		//Value that user puts in when asking for number
		//puts inputs that the user put in for the question
		double n1 = keyboard.nextDouble();
		double n2 = keyboard.nextDouble();
		double n3 = keyboard.nextDouble();
		//Finding the answer to the asked question
		double sum = (n1+n2+n3);
		double product = (n1*n2*n3);
		//prints
		System.out.println("The sum of " + n1 + " and " + n2 + " and " + n3 + " is " + sum);
		System.out.println("The product of " + n1 + " and2 " + n2 + " and " + n3 + " is " + product);
		
	}

}
