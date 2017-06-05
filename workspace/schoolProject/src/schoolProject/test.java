package schoolProject;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner (System.in);
		System.out.println("Who wants the first move?: \n 1.) Computer \n 2.) Player" );
		int firstOrSecond;
		firstOrSecond = userInput.nextInt();
		int computerAnswer=0;
		int total=0;
		int remainder;
		
		int answer;
		//program works without first if statement, when I put if(firstOrSecond==2) it causes infinite whileloop
		//if(firstOrSecond==1){
		while(total<100){
			answer = userInput.nextInt();
			System.out.println("Put in a number between 3-13: ");
		 if(answer<=13&&answer>=3){
			total=answer+total;
			remainder=100-total;
			System.out.println("Number Inputed: " + answer);
			
		 }if (total==8||total==21||total==34||total==47||total==60||total==73||total==86){
			computerAnswer = 13;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=computerAnswer+total;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=3&&total<=5){
			computerAnswer = 8-answer;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
		//Any if statement that has an if statement that has a if (total == x || total == x ) glitches out like crazy
		}if (total==6||total==7){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=9&&total<=18){
			computerAnswer = 21-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if(total==20||total==19){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if(total>=22&&total<=31){
			computerAnswer=34-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==33||total==32){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=35&&total<=44){
			computerAnswer=47-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==45||total==46){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=48&&total<=57){
			computerAnswer=60-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==58||total==59){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
		
		}if (total>=61&&total<=70){
			computerAnswer=73-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==71||total==72){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=74&&total<=83){
			computerAnswer=86-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
		
		}if (total>=100){
			System.out.println("You lose, no one can beat a computer...HA!");
			
		}if(total>=97&&total<=99){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			System.out.println(total);
			System.out.println("You win!");
			
				
			
		//}
		}
		}
		
		//program works without first if statement, when I put if(firstOrSecond==2) it causes infinite whileloop
		if(firstOrSecond==2){	
		computerAnswer =8;	
		System.out.println("Number Inputed By Computer: " + computerAnswer);
		total=total+computerAnswer;
		remainder=100-total;
		System.out.println("Amount Remaining: " + remainder);
		System.out.println("Put in a number between 3-13: ");
		answer = userInput.nextInt();
		
		while(total<100){
			answer = userInput.nextInt();
			System.out.println("Put in a number between 3-13: ");
		
		}if (total>=9&&total<=18){
			computerAnswer = 21-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if(total==20||total==19){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if(total>=22&&total<=31){
			computerAnswer=34-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==33||total==32){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=35&&total<=44){
			computerAnswer=47-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==45||total==46){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=48&&total<=57){
			computerAnswer=60-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==58||total==59){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
		
		}if (total>=61&&total<=70){
			computerAnswer=73-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total==71||total==72){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
			
		}if (total>=74&&total<=83){
			computerAnswer=86-total;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			remainder=100-total;
			System.out.println("Amount Remaining: " + remainder);
		
		}if (total>=100){
			System.out.println("You lose, no one can beat a computer...HA!");
			
		}if(total>=97&&total<=99){
			computerAnswer=3;
			System.out.println("Number Inputed By Computer: " + computerAnswer);
			total=total+computerAnswer;
			System.out.println(total);
			System.out.println("You win!");
		}
		}
		
	}

}
