import java.util.Scanner;

public class Q22 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter element");
		for(int i=0;i<9;i++)
		{
			ar[i]=s.nextInt();
		}
		for (int i = 0; i < 9; i++) 
        {
            for (int j = i + 1; j < 9; j++) 
            {
                if (ar[i] < ar[j]) 
                {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
            System.out.print(ar[i] + ",");
        }
		
	}
}
