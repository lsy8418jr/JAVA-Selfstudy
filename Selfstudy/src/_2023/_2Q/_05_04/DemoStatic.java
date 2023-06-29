package _2023._2Q._05_04;

class Friend {
	String name;
	static int nof;

	Friend(String name) {
		this.name = name;
		nof++;
	}
}

public class DemoStatic {
	public static void main(String[] args) {

		Friend f1 = new Friend("Scott");
		Friend f2 = new Friend("Michelle");
		Friend f3 = new Friend("Sophia");

		System.out.println(Friend.nof);
	}
}
