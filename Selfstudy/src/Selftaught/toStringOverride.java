
class Card {
	String kind;
	int number;

	Card() {
		this("Spade", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "kind : " + kind + " ,number : " + number;
	}
}

public class toStringOverride {
	public static void main(String[] args) {
		System.out.println(new Card().toString());
	}

}
