import java.util.Scanner;

public class GPACalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double c1;
		double c2;
		double c3;
		double cg1;
		double cg2;
		double cg3;
		
		c1 = keyboard.nextDouble(); 
		System.out.println("Enter the first course credits: " + c1);
		cg1 = keyboard.nextDouble();
		System.out.println("Enter the first course grade: " + cg1);
		c2 = keyboard.nextDouble();
		System.out.println("Enter the second course credits: " + c2);
		cg2 = keyboard.nextDouble();
		System.out.println("Enter the second course grade: " + cg2);
		c3 = keyboard.nextDouble();
		System.out.println("Enter the third course credits: " + c3);
		cg3 = keyboard.nextDouble();
		System.out.println("Enter the third course grade: " + cg3);
		
		double GPA = (c1*cg1+c2*cg2+c3*cg3)/(c1+c2+c3);
		
		System.out.println("Your GPA is: " + GPA);
	}

}
