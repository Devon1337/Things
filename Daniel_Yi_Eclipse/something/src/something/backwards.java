package something;
import java.util.Scanner;

public class backwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("type in a word: ");
		
		String wordOne = keyboard.next();
		
		
			//for (int x = (wordOne.length()-1); x>-1; x--){
			int wordLength = wordOne.length();
			for (int i = wordLength-1; i >-1; i--){
				System.out.print(wordOne.charAt(i));
				
			
				
		}
	}

}
