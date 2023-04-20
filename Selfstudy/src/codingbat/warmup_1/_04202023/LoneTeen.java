package codingbat.warmup_1._04202023;

public class LoneTeen {
	public static boolean loneTeen(int a, int b) {
		  if((a >= 13 && a <= 19)&&(b >= 13 && b <= 19)) {
			  return false;
		  }
		  else if((a >= 13 && a <= 19)||(b >= 13 && b <= 19)) {
			  return true;
		  }
		  else {
			  return false;
		  }
	}
public static void main(String[] args) {
	System.out.println(loneTeen(13, 13));
	System.out.println(loneTeen(20, 15));
}
}
