import java.util.Scanner;
import java.util.Random;
public class whileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		Random rGenerator = new Random();
		
		int RanNumber = rGenerator.nextInt(10);
		int counter = 0;
		int userNumber = 0;
		while (userNumber !=1){
				counter++;
				System.out.println(RanNumber);
				RanNumber = rGenerator.nextInt(10);
				
				System.out.println("Stop??");
				userNumber = input.nextInt();
		}
		System.out.println(counter);
	}

}
