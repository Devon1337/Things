import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner userInput = new Scanner(System.in);
		  System.out.println("Put in a word or sentence to reverse: ");
		  String userAnswer = userInput.nextLine();
		  int length = userAnswer.length();
		  String reverse = "";
		  for ( int i = length - 1 ; i >= 0 ; i-- )
		  reverse = reverse + userAnswer.charAt(i);
		  System.out.println("The reversed word or sentence is: "+reverse);
	}

}
