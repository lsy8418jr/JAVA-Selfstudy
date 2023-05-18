package codingbat._05172023;

public class AltPairs {
	public String altPairs(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i += 4) {
			if (i == str.length() - 1) {
				result = result + str.charAt(i);
				break;
			}

			result = result + str.substring(i, i + 2);
		}
		return result;
	}

	public static void main(String[] args) {
		AltPairs ob = new AltPairs();
		System.out.println(ob.altPairs("CodingHorror"));
		System.out.println(ob.altPairs("thisthattheOther"));

	}
}
