package _2023._05022023;

public class ObjectArray {
	public static void main(String[] args) {

		Food food1 = new Food("Pizza");
		Food food2 = new Food("burgers");
		Food food3 = new Food("hoagies");
		Food[] refri = { food1, food2, food3 };

		System.out.println(refri[0].name);
		System.out.println(food1.name);

	}

}

class Food {
	String name;

	Food(String n) {
		name = n;
	}
}