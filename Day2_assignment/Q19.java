import java.util.Scanner;

public class Q19 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter element");
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum = sum+(2*i-1)*(2*i-1);
		}
		System.out.println("sum of series"+sum);
	}
}