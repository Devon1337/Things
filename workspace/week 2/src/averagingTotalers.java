import java.util.Scanner;
public class averagingTotalers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner (System.in);
		System.out.println("Type in 3 numbers");
		double total=0;
		int counter = 0;
		double firstNumber;
		//firstNumber = userInput.nextDouble();
	//	double secondNumber;
		//secondNumber = userInput.nextDouble();
		//double thirdNumber;
		//thirdNumber = userInput.nextDouble();
		for (int i=0;i<=counter;i++){
			counter++;
			firstNumber = userInput.nextDouble();
			total=(firstNumber+total);
			double average = total/counter;
			System.out.println("The average number is: " + average);
		
	}
		
		
	
	}

}
