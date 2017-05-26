import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number you want to calculate factorial for: ");
		int userRequest;
		userRequest = userInput.nextInt();
		int answer = 1;
		
		for(int i=1; i<userRequest+1; i++){
	
		answer = i*answer;
		
		}
		System.out.print(answer);
	}

}
