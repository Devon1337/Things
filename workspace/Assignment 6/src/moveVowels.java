import java.util.Scanner;
public class moveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	//	char[] charLetters;
		Scanner userInput = new Scanner (System.in);
		char vowels[]=new char [5];
		vowels[0]='a';
		vowels[1]='e';
		vowels[2]='i';
		vowels[3]='o';
		vowels[4]='u';
		String Input = userInput.next();
		char temp;
		int counter = 0;
		char [] letters = new char [10];
		for(int i = 0; i<10; i++){
			for(int x = 0; x < 5; x++) {
			letters[i] = Input.charAt(i);
			System.out.print(letters[i]);						

			if(letters[i].toLowerCase() == vowels[x]){
				temp=letters[i];
				letters[i]=letters[counter];
				letters[counter]=temp;
				counter++;
				
				
			}
			}
		}
		System.out.println("");
		System.out.print(letters);
	}

}
