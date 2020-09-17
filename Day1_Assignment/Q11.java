import java.util.Scanner;

public class Q11 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter X, Y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Value of X, Y before swap"+x  +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of X, Y before swap"+x  +y);
	}
}
