import java.util.Scanner;

public class Q21 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		int sum=0;
		int avg=0;
		System.out.println("Enter element");
		for(int i=0;i<9;i++)
		{
			ar[i]=s.nextInt();
			 sum =sum+ar[i];
			 avg = sum/10;
		}
		System.out.println("Sum of element"+sum);
		System.out.println("avg of element"+avg);
		
	}
}
