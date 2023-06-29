package _2023;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand=new Random();
		int rand_int=rand.nextInt(100);
		
		System.out.println(rand_int);

	}

}
