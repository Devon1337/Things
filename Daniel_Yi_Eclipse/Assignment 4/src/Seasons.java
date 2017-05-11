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
		//Intergers for the Hemispheres
		int North = answer;
		int South = answer + 12;
		
		
		//booleans for Hemisphere
		//boolean northHemi = answer==north;
		//boolean southHemi = answer==south;
		
		System.out.println("What month it is? (1-12)");
		//user input/answer for the month
		int month;
		month = input.nextInt();
		
		int lastNorth = North+month;
		//Switches for Northern Hemisphere
		switch(lastNorth){
			case 2: 
			case 3:
			case 13:
				//boolean winter12 = month == 12 && northHemi;
				System.out.println("It is winter");
				break;
		
				
				
		}
		
		int lastSummer = South+month;
		//Switches for Souther Hemisphere
		switch(lastSummer){
			case 16:
			case 15:
			case 26:
				System.out.println("It is summer");
				break;
		}
	
		System.out.println(lastSummer);
		System.out.println(lastNorth);
	}

}
