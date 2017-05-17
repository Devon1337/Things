import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class MinimumNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("ints");
		Scanner s = new Scanner (f);
			int min = s.nextInt();
			while (s.hasNext()){
				
				if(s.nextInt()<min)
					{min=s.nextInt();
				}
				System.out.println("the minimum number is " + min);
			}
		}

	}
