package JavaABeginners.chap7;

class ErrorMsg {
	final int outer = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;

	String msgs[] = { "Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds" };

String getErrorMsg(int i) {
	if(i>=0 & i<msgs.length) {
		return msgs[i];
		
	}
	else {
		return  "Invalid Error Code";
	}
}

}

public class FinalD {
public static void main(String[] args) {
	ErrorMsg err= new ErrorMsg();
	
	System.out.println(err.getErrorMsg(err.outer));
}
}
