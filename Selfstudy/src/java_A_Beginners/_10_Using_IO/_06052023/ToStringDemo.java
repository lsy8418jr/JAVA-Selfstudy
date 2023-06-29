package java_A_Beginners._10_Using_IO._06052023;

class Card {
	String kind;
	int num;

	Card() {
		this("spade", 1);
	}

	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "kind : " + kind + ". num : " + num;
	}
}

public class ToStringDemo {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
