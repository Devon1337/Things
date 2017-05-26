import java.util.Scanner;
public class Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("type in a sentence.");
String sentence = input.nextLine();
		int n = sentence.length();
		char[] stringCharArray = new char[n];
		for (int i=0; i<n; i++){
			stringCharArray[i] = sentence.charAt(i);
		
		}
		
		for (int i=0; i<n; i++){
		System.out.print(stringCharArray);
		}
		
	}

}
