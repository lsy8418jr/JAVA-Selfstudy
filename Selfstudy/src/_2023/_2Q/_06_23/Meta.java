package _2023._2Q._06_23;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

class Meta {
	@MyAnno(str = "Annotation example ", val = 100)
	public static void myMeth() {
		Meta ob = new Meta();

		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			System.out.println("method not found");
		}
	}
	public static void main(String[] args) {
		myMeth();
	}
}
