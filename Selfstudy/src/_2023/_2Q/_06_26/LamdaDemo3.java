package _2023._2Q._06_26;

interface Workable {
	void work();
}

class Person {
	void action(Workable workable) {
		workable.work();
	}
}

public class LamdaDemo3 {
	public static void main(String[] args) {
		Person pr = new Person();

		pr.action(() -> {
			System.out.println("go to work");
		});
	}
}
