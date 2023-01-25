abstract class A1 {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("Stop");
	}
}

interface Fight {
	public void move(int x, int y);

	public void attack(Fight f);
}

class Fighter extends A1 implements Fight {

	@Override
	public void move(int x, int y) {
		System.out.println("move to " + "[" + x + "," + y + "]");
	}

	@Override
	public void attack(Fight f) {
		System.out.println("attack " + f);

	}
}

public class Prac_Interface {
	public static void main(String[] args) {
		Fighter f=new Fighter();
		f.move(100, 200);
		f.attack(f);
		f.stop();
	}

}
