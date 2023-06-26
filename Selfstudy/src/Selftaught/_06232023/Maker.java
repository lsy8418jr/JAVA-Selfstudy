package Selftaught._06232023;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMaker {
}

public class Maker {
	@MyMaker
	public static void myMeth() {
		Maker ob = new Maker();
		try {
			Method m = ob.getClass().getMethod("myMeth");

			if (m.isAnnotationPresent(MyMaker.class)) {
				System.out.println("mymaker is present");
			}

		} catch (NoSuchMethodException e) {
			System.out.println("no found");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}
}
