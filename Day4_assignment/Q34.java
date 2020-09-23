import java.util.Scanner;

class circle{

	int Radius;
	double Area;
	void init(int r) {
		System.out.println("Get radius");
		Radius = r;
	}
	void calculateArea() {
		System.out.println("calculate area");
	Area = 3.14*Radius*Radius;	
	}
	void display() {
		System.out.println(" Area of circle" +Area);
		System.out.println("radius of circle is: "+Radius);
	}
	
}
public class Q34 {
	public static void main(String args[]) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Radius for area of circle");
	int r= s.nextInt();
	circle c =new circle();
	c.init(r);
	c.calculateArea();
	c.display();
	System.out.println("================");
}

}
