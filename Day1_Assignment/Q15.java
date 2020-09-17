import java.util.Scanner;

public class Q15 {

	public static void main(String args[]) {
		System.out.println("Enter Gender and age");
		Scanner s = new Scanner(System.in);
		String gender = s.next();
		int age = s.nextInt();
		if(age>18)
		{
			System.out.println(age +gender +"elligible for marriage");
		}
		else {
			System.out.println("Not elligible for marriage");
		}
		
	}
}
