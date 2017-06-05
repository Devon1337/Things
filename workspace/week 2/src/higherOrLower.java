import java.util.Scanner;
public class higherOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner (System.in);
		System.out.print("Put in a number (First person): ");
		double number = userInput.nextDouble();
		System.out.print("Put in a number (Second Person): ");		
		double secondNumber = userInput.nextDouble();
			if(number>secondNumber){
				System.out.println("Second number was lower then the first number.");
			}else if (number<secondNumber){
				System.out.println("Second number was higher then the first number.");
			}else if (number==secondNumber){
				System.out.println("The second number is equal to the first number.");
			}
	}

}
