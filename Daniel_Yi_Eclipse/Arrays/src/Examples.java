import java.util.Scanner;
public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] intArray = new int [6];
		
		int n = intArray.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(intArray[j-1] > intArray[j]){  
                                 //swap elements  
                                 temp = intArray[j-1];  
                                 intArray[j-1] = intArray[j];  
                                 intArray[j] = temp;  
                          }                        
                 }
         }
                          
                   
		for(int i = 0; i < 6; i++){
			System.out.println("Type in a number.");
			intArray[i] = input.nextInt();
			
		}

		for(int i = 0; i < 6; i++){
			System.out.print("Number " + i + " is ");
			System.out.println(intArray[i]);
			
		}
	}

}
