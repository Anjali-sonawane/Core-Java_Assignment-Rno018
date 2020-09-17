import java.util.Scanner;

public class Q14 {

	public static void main(String args[]) {
		System.out.println("Enter Year");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if(year %400 ==0 && year%100 == 0 && year %4==0)
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		
	}
}
