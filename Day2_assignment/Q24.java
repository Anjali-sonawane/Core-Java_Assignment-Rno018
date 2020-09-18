import java.util.Scanner;

public class Q24 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter element");
		for(int i=0;i<5;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter element to be search");
		int key = s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(key==ar[i]) {
				System.out.println(key+"element is found at location"+i);
			}
		
		}
	}
}
