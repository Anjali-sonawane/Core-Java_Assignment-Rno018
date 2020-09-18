import java.util.Scanner;

public class Q25 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter element");
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<5;i++)
		{
			if(ar[i]%2==0) {
				even=even+ar[i];
			}
			else {
				odd=odd+ar[i];
			}
		}
		System.out.println("Sum of even number"+even);
		System.out.println("sum of odd number"+odd);
		
	}
}
