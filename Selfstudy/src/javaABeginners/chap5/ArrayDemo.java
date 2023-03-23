package javaABeginners.chap5;

class ArrayDemo {
	public static void main(String[] args) {
		int sample[] = new int[10];

		for (int i = 0; i < 10; i++) {
			sample[i] = i * 2;
			System.out.println("This is sample[" + i + "]: " + sample[i]);
		}

	}
}