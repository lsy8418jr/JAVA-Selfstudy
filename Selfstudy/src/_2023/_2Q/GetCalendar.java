package _2023._2Q;


import java.util.Calendar;

public class GetCalendar {
public static void main(String[] args) {
	
	Calendar today=Calendar.getInstance(); // get calendar
	
	System.out.println("This year : "+today.get(Calendar.YEAR));
	
	System.out.println("Month (0 is January) : "+today.get(Calendar.MONTH));
	
	switch(today.get(Calendar.MONTH)) {
	case 0:
		System.out.println("January");
		break;
	case 1:
		System.out.println("February");
		break;
	}
			
			

	
}
}
