package switches;
import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hello = new Scanner(System.in);
		
		System.out.println("You see a dollar on the floor what do you do? \n 1) Steal it \n 2) give it back \n 3) Spend it");
		int number;
		number = hello.nextInt();
		
		switch(number){
			default: 
				System.out.println("You did nothing");
				break;
			case 1:
				System.out.println("You stole it noob");
				break;
			case 2:
				System.out.println("You're a nice person");
				break;
			case 3:
				System.out.println("Buy CSGO skins");
				break;
		
		}
		
		
	}

}
