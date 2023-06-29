package java_A_Beginners.chap3;

 class Vehicle1 {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon

	Vehicle1(int p, int f, int m) {
		this.passengers = p;
		this.fuelcap = f;
		this.mpg = m;
	}

	int range() {
		return mpg * fuelcap;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

}

public class ConDemo {
	public static void main(String args[]) {
		// construct complete Vehicle1s
		Vehicle1 minivan = new Vehicle1(7, 16, 21);
		Vehicle1 sportscar = new Vehicle1(2, 14, 12);
		double gallons;
		int dist = 252;
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}