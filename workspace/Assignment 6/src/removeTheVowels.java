import java.util.Scanner;
public class removeTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		String Input = userInput.next();
		String letters[] = new String[10];
		for (int i=0; i<10;i++){
		char something = Input.charAt(0+i);
		letters [i]= Character.toString(something);
		letters[i] = letters[i].replaceAll("[aeiouAEIOU]", "");
		System.out.print(letters[i]);
		
		}
	   
	}

}
