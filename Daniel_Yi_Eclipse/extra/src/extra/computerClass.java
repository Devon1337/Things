package extra;
import java.util.Scanner;
public class computerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner (System.in);
		
		String [][] computerClass = new String [5][4];
		
		for(int r=0;r<5;r++){
			for(int c=0;c<4;c++){
				
				computerClass[r][c] = userInput.next();
			}
		}
		
		for(int r=0;r<5;r++){
			for  (int c=r+1;c<4;c++){
				if (computerClass[j][1]<computerClass [i][1]){
					
				}
			}
		}
	}

}
