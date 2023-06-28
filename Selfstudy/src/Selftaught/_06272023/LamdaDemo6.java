package Selftaught._06272023;

interface Create1 {
	Member create(String id);
}

interface Create2 {
	Member creat2(String id, String name);
}

class Member {
	private String id, name;

	Member(String id) {
		this.id = id;
	}

	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		String str = "id :" + id + " , name :" + name;
		return str;
	}
}

public class LamdaDemo6 {

	Member getMember1(Create1 create1) {

		Member mem = create1.create("winter");
		return mem;
	}

	Member getMember2(Create2 create2) {
		Member mem2 = create2.creat2("Fall", "what");
		return mem2;
	}

	public static void main(String[] args) {
		LamdaDemo6 ld = new LamdaDemo6();

		System.out.println(ld.getMember1(Member::new));
	}

}
