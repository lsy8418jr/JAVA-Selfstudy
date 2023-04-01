package codingbat.warmup_1._04012023;

public class Diff21 {
	
	public int diff(int n) {
		  int result;
		  result=n-21;
		  
		  
		  if(n>21){
		    return result*2;
		  }
		  else {
		    return Math.abs(result);
		  }
		}

	public static void main(String[] args) {

		Diff21 ob= new Diff21();
		System.out.println(ob.diff(3));
		System.out.println(ob.diff(9));
		System.out.println(ob.diff(21));
		System.out.println(ob.diff(25));
	}

}
