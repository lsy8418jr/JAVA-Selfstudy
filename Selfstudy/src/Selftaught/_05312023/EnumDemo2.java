package Selftaught._05312023;

public class EnumDemo2 {
	public static void main(String[] args) {
		Transport tp;
		System.out.println("Here are all transport constants");
		Transport allTransport[] = Transport.values(); // obtain an array of tp constant

		for (Transport t : allTransport) {
			System.out.println(t);
		}
		System.out.println();

		tp = Transport.valueOf("AIR"); // obtain the constant with the name AIR
		System.out.println("tp contains " + tp);

	}
}
