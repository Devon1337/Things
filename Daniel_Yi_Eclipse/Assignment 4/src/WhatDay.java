import java.util.Scanner;
public class WhatDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("What number day is it? (1-7) ");
	Scanner userInput = new Scanner (System.in);
	int day;
	day = userInput.nextInt();

		switch(day){
		case 1:
			System.out.println("It is Monday.");
			break;
		case 2:
			System.out.println("It is Tuesday.");
			break;
		case 3:
			System.out.println("It is Wednsday.");
			break;
		case 4:
			System.out.println("It is Thursday.");
			break;
		case 5:
			System.out.println("It is Friday.");
			break;
		case 6:
			System.out.println("It is Saturday.");
			break;
		case 7:
			System.out.println("It is Sunday.");
			break;
		}
	}

}
