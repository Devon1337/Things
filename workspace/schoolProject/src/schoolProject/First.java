package schoolProject;
import java.util.Random;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		
		
		
		int maxNumber;
		int minPool;
		int maxPool;
		
		// Generated Debug Numbers
		double requirement;
		int formula;
		int dummyNumber = 0;
		int goalNumber;
		int computerAnswer;
		int counter = 1;
		int total = 0;
		
		// Prompt User
		Scanner userInput = new Scanner (System.in);
		System.out.println("What number do you want to go up to?");
		maxNumber = userInput.nextInt();
		System.out.println("What do you want for the minimum number in number pool?(Plz pick a number higher then 1 or it would be really boring) ");		
		minPool = userInput.nextInt();
		System.out.println("What do you want for the maximum number in number pool? ");		
		maxPool = userInput.nextInt();
		System.out.println("The rules are first to " + maxNumber + " or over " + maxNumber + " loses and can only use numbers " + minPool + "-" + maxPool + ". ");
		
		// After Calculated Info
		int ArrayLength = MaxPool-MinPool
		public static int[][] GoodChoices = new int[ArrayLength][2]
		int remainder = maxNumber - total;
		int primary = maxNumber%maxPool;
		
		Random rNumber = new Random ();
		int forRandomNumber = minPool+1;
		int fillerNumber;
		fillerNumber = rNumber.nextInt(maxPool-minPool)+forRandomNumber;
		int answer;
		System.out.println("Put in a number");
	//	boolean win = total>maxNumber-maxPool&&total>maxNumber-minPool;
	//	boolean lose = total>=maxNumber;
		
		int extraNumber;
		while (total<maxNumber){
			requirement=(maxPool*(counter-1)+primary);
			answer = userInput.nextInt();
			goalNumber = (maxPool*counter)+primary;
			extraNumber = (total+answer)-answer;
			formula =(goalNumber)-total;
		if(answer<=maxPool&&answer>=minPool){
			total=answer+total;
			remainder=maxNumber-total;
			System.out.println("Number Inputed: " + answer);
			System.out.println("Remaining number: " + remainder);
			formula =(goalNumber)-total;
			
		}if (total<primary&&primary!=0&&primary>=minPool){
			computerAnswer = primary;
			total = computerAnswer + total;
			remainder=maxNumber-total;
			System.out.println("Computer inputed: " + computerAnswer);
			System.out.println("Remaining number: " + remainder);
		
		}if (total!=0&&total<maxNumber&&formula>=minPool){
			computerAnswer = formula;
			total=computerAnswer + total;
			remainder=maxNumber-total;
			dummyNumber=total;
			System.out.println("Computer inputed: " + computerAnswer);
			System.out.println("Remaining number: " + remainder);
			
		}if (extraNumber>=maxNumber){
			System.out.println("You lose!");
		}if (dummyNumber>maxNumber-maxPool&&dummyNumber>maxNumber-minPool&&dummyNumber!=maxNumber){
			System.out.println("You win!");
		}if (formula<minPool&&formula>0){
			computerAnswer = fillerNumber;
			total=computerAnswer + total;
			remainder=maxNumber-total;
			System.out.println("Computer inputed: " + computerAnswer);
			System.out.println("Remaining number: " + remainder);
			//while (requirement<=total){
		}if (requirement<=total){
			
			counter++;
		}
		
		}

	}
	/*
	1-Repeat Same Steps
	2-No Idea(Random Input)
	3-Use Focused Numbers
	4-Input Numbers to Focused Numbers
	5-Unknown State
	*/
	public static StatusReporting(int req, int choice, int prev, int state) {
		if(req==choice) {
			GoodChoices[prev][choice];
			return 1
		} else if(req==choice)
		
	}
	
	public static void PrintDebug() {
		System.out.println("c" + counter);
		System.out.println("gN" + goalNumber);
		System.out.println("dN" + dummyNumber);
		System.out.println("t" + total);
		System.out.println("max" + maxNumber);
		System.out.println("minP" + minPool);
		System.out.println("maxP" + maxPool);
		System.out.println("p" + primary);
		System.out.println("f" + formula);
		System.out.println("r" + requirement);
		System.out.println("filler" + fillerNumber);
	}

}
