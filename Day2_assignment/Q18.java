import java.util.Scanner;

public class Q18 {

	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter number");
		int num = s.nextInt();
		int flag = 0;
		if(num==0 || num==1) {
			System.out.println(num+ "number is not prime");
		}
		else {
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0) 
				{
					System.out.println(num+ "number is not prime");
					flag = 1;
					break;
				}
			}

			if(flag==0) {
				System.out.println(num+ "number is prime Number");
			}
		}
		
				
	}
}
