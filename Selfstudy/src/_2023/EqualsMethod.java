package _2023;

class Person{
	int id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id==((Person)obj).id;
		else
			return false;
	}
	
	
	Person(int id){
		this.id=id;
	}
}
class Hi{
	public static void main(String[] args) {
		Person p1=new Person(1234);
		Person p2=new Person(1234);
		
		System.out.println(p1.equals(p2));
	}
}



