import java.util.Scanner;
public class moveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
	//	char[] charLetters;
		String temp;
		int counter = 1;
		Scanner userInput = new Scanner (System.in);
		String [] letters = new String [10];
	//	String Input = userInput.next();
		for(int i=0; i<10;i++){
			letters[i]=userInput.next();
			System.out.print(letters[i]);

			if(letters[i]=="[aeiouAEIOU]"){
				temp=letters[i];
				letters[i]=letters[counter];
				letters[counter]=temp;
				counter++;
				System.out.println(letters);
				System.out.println(counter);
			}
		}


	}

}
