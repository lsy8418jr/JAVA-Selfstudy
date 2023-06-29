package java_A_Beginners._03_Program_Control_Statements;




 class vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon
	void range() {
		System.out.println("range is "+fuelcap*mpg);
	}
}

public class vehicleDemo {
	public static void main(String[] args) {
		vehicle minivan = new vehicle();
		vehicle sportscar = new vehicle();
		int range1, range2;
		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		// assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		// compute the ranges assuming a full tank of gas
		
//		  range1 = minivan.fuelcap * minivan.mpg; range2 = sportscar.fuelcap *
//		  sportscar.mpg; System.out.println("Minivan can carry " + minivan.passengers +
//		  " with a range of " + range1); System.out.println("Sportscar can carry " +
//		  sportscar.passengers + " with a range of " + range2);
		
		minivan.range();
		 
	}
}