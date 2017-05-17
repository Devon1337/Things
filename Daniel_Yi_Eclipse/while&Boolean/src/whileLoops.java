import java.util.Scanner;
import java.util.Random;
public class whileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Type in a number when to stop: ");
		Scanner input = new Scanner (System.in);
		int userInput = input.nextInt();
		int counter = 1;
		int total=1;
			while (counter < userInput)
			{
				
				total =total*counter;
				System.out.println("the total is " + total);
				counter++;
				
				
				
				
				
				
				
				
				
				
			}
			
	}

}
