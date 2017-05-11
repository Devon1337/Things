
public class WorldTraveler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initial integers
		int circumference = 24902;
		int hour = 10583;
		int speed = 352;
		//total traveled area (first part)
		int traveled = speed*hour;
		//total amount of traversals
		int traversal = traveled/circumference;
		//remainder after traveled traversals
		int remainder = traveled%circumference;
		//changed version of initial values (third part)
		int secondSpeed = 483;
		//total traveled area after changed initial values
		int secondTraveled = secondSpeed*hour;
		//total amount of traversals after changed initial values
		int secondTraversal = secondTraveled/circumference;
		
		
		System.out.println("Going 352 mpg, you could complete " + traversal + " traversals");
		System.out.println("Extra miles traveled: " + remainder);		
		System.out.println("Going 483 mph, your could complete " + secondTraversal + " traversals");
		
		
	}

}
