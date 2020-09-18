import java.util.Scanner;

public class Q23 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter element");
		for(int i=0;i<10;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Original Array printed in reverse order:");
        for(int i= ar.length-1;i>=0;i--)
        System.out.print(ar[i] + "  ");
   }

}
