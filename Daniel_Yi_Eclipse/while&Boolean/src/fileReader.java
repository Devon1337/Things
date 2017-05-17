import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class fileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("textExample.txt");
		Scanner s = new Scanner (f);
			while (s.hasNext()){
	
					System.out.println(s.nextLine());
			}
				
	}

}
