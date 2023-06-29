package java_A_Beginners._12_AutoBoxing._06092023;



public class EnumDemo2 {
	public static void main(String[] args) {

		Transport tp;
		System.out.println("Here are all Transport constants");
		Transport allTransport[] = Transport.values();
		for (Transport t : allTransport) {
			System.out.println(t);
		}
		System.out.println();

		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);
	}

}
