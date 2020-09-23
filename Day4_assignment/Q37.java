class Person{
	int Age;
	String Name;
	Person(){
		Age=18;
		Name ="anjali";
	}
	void show() {
		System.out.println("Age of person: "+Age);
		System.out.println("Name of person: "+Name);
	}
}
class PersonDemo extends Person{
	PersonDemo(){
		Age=20;
		Name ="sonawane";
	}
	void show() {
		super.show();
		System.out.println("in person demo ");
	}
	//System.out.println("in person demo ");
}
public class Q37 {

	public static void main(String args[]) {
		Person p =new Person();
		p.show();
		PersonDemo p1 =new PersonDemo();
		p1.show();
	}
}
