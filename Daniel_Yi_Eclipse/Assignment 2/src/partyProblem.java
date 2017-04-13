
public class partyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int for info about Molly and her requirements
		int siblings = 3;
		int molly = 3;
		//int for info about Jenny and her requirements
		int age = 15;
		int jenny = 16;
		
		//boolean true and false statements for each int
		boolean molly3 = molly < siblings;
		boolean jenny15 = jenny>age;
		boolean robert = molly3 || jenny15;
		boolean patrick = robert && !jenny15;
		boolean allen = jenny15 || patrick && !robert;
		
		System.out.println("Molly gets cake: " +  molly3);
		System.out.println("Jenny gets cake: " + jenny15);
		System.out.println("Robert gets cake: "  +  robert);
		System.out.println("Patrick gets cake: " + patrick);
		System.out.println("Allen gets cake: " + allen);
	}

}
