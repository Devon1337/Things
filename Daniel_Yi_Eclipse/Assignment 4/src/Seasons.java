import java.util.Scanner;
public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Are you in the Northern or Southern Hemisphere? \n 1.) North \n 2.) South: ");
		//user input/answer for Hemisphere
		int answer;
		answer = input.nextInt();
		System.out.println("What month it is? (1-12)");
		//user input/answer for the month
		int month;
		month = input.nextInt();
		
		//Switches for Northern Hemisphere
	if(answer==1){
	switch(month){
			case 1: 
			case 2:
			case 12:
				System.out.println("It is Winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("It is Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("It is Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("It is Fall");
				break;
	}
	}		
		//Switches for Southern Hemisphere
		if(answer==2){
			switch(month){
			case 1:
			case 2:
			case 12:
				System.out.println("It is Summer");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("It is Fall");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("It is Winter");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("It is Spring");
				break;
		}
		}
		
		
	}

}
