
public class WorldTraveler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initial value
		int circumference =24902;
		int travelSpeed = 352;
		int timeHour = 10583;
		
		int initialTraveled = (travelSpeed*timeHour);
		
		int transversal = (circumference/travelSpeed); //transversal in interger form
		
		int totalAmount = (initialTraveled/circumference); //Total amount of transversals in an interger value
		
		int 
		
		int secondTravelspeed = 483; //Total amount of transversals in an interger value
		int secondTransversal = (circumference/secondTravelspeed);
		int secondtotalAmount = (timeHour/secondTransversal);
		
		
		double traveled = (travelSpeed*timeHour);
		double doubletotalAmount = (initialTraveled/circumference);
		
		
		
		//time for each traversal and final value (In double form)
		double doubletdoubleTransversal = circumference/travelSpeed;
		double totalAmountDouble = (timeHour/doubleTransversal);
		double remainder = (totalAmountDouble-totalAmount);
		//double remainderMiles = (circumference*remainder);
	
		//integer form for each transversal and final value
		int intDoubleTransversal = circumference/travelSpeed;
		int intTotalAmount = (timeHour/intDoubleTransversal);
		double intRemainder = (intTotalAmount-totalAmount);
		//int intRemainderMiles = (circumference*intRemainder);
		
		//Total amount of traversals from 352 mph travel speed
		//System.out.println("Going 352 mph, you could travel " + totalAmountDouble + " transversals.");
		System.out.println("Going 352 mph, you could travel " + totalAmount + " transversals.");
		
		//Total remainder from traversal (Extra in miles)
		//System.out.println("Extra miles traveled " + remainderMiles + " miles." );
		//System.out.println("Extra miles traveled " + intRemainderMiles  + " miles.");
		//Total amount of traversals from 483 mph travel speed
		//System.out.println("Going 483 mph, you could travel " + secondtotalAmount + " transversals.");
		
		
	}

}
