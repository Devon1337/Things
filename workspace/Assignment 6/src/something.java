import java.util.Scanner;
public class something {
	public static void main(String[] args) {
		int counter = 0;
		int i = 0;
		String temp;
		int filler = 0;
		Scanner userInput = new Scanner(System.in);
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
		
		
		
		String letters[]=new String [10];
		while (filler<10){
		i++;
			letters[i]=userInput.next();
			System.out.print(letters[i]);
			System.out.println(counter);
			System.out.println(i);
			if(letters[filler]!=vowels[counter]){
				counter++;
				System.out.println(counter);
			}else if (letters[filler]==vowels[counter]){
				temp=letters[i];
				letters[i]=letters[counter];
				letters[counter]=temp;
				filler++;
				System.out.println(filler);
				System.out.println(letters);
			}
		}
		
		}
		
		
		
	
}
