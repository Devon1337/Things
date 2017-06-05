import java.util.Scanner;
public class vowelLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner (System.in);
		String Input = userInput.next();
		/*
		String vowels[]=new String [10];
		vowels[0]="a";
		vowels[1]="A";
		vowels[2]="e";
		vowels[3]="E";
		vowels[4]="i";
		vowels[5]="I";
		vowels[6]="o";
		vowels[7]="O";
		vowels[8]="u";
		vowels[9]="U";
		*/		
		String letters[] = new String[10];
		for (int i=0; i<10;i++){
			char something = Input.charAt(0+i);
				letters [i]= Character.toString(something);

		}
		
	}

}
