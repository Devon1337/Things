import java.util.Scanner;
public class moveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	//	char[] charLetters;
		Scanner userInput = new Scanner (System.in);
		char vowels[]=new char [10];
		vowels[0]='a';
		vowels[1]='A';
		vowels[2]='e';
		vowels[3]='E';
		vowels[4]='i';
		vowels[5]='I';
		vowels[6]='o';
		vowels[7]='O';
		vowels[8]='u';
		vowels[9]='U';
		String Input = userInput.next();
		int i;
		char temp;
		int counter = 0;
		char [] letters = new char [10];
		for(i = 0; i<10; i++){
			letters[i] = Input.charAt(i);
			System.out.print(letters[i]);						

			if(letters[i] == vowels[0] || letters[i] == vowels[1] || letters[i] == vowels[2] || letters[i] == vowels[3] || letters[i] == vowels[4] || letters[i] == vowels[5] || letters[i] == vowels[6] || letters[i] == vowels[7] || letters[i] == vowels[8] || letters[i] == vowels[9]){
				temp=letters[i];
				letters[i]=letters[counter];
				letters[counter]=temp;
				counter++;
				
				
			}
			
		}
		System.out.println("");
		System.out.print(letters);
	}

}
