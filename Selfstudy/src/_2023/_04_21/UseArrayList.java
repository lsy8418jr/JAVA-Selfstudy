package _2023._04_21;

import java.util.ArrayList;

public class UseArrayList {
public static void main(String[] args) {

	//ArrayList= resizable array
	
	
	ArrayList<String> food=new ArrayList<>();
	
	food.add("pizza");
	food.add("kimchi");
	food.add("sandwich");
	food.add("cheese");
	
	food.set(0, "sushi");
	food.remove(1);
	
	for(int i=0;i<food.size();i++) {
		System.out.println(food.get(i));
	}
}
}
