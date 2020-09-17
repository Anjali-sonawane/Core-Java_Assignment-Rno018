import java.util.Scanner;
class Q6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radious");
	int r = sc.nextInt();
	int area = (3.14*r*r);
	System.out.println("Area of circle: " + area);
	
	int peri = (2*3.14*r);
	System.out.println("perimeter of circle: "+peri);
	}
}