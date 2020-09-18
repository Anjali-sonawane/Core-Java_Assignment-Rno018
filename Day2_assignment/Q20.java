import java.util.Scanner;

public class Q20 {

	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter 2 number");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		while(num1<num2) {
			int flag = 0;
			for(int i=2;i<=num1/2;i++) 
			{	
				if (num1 % i == 0) 
		    	  {
		            flag = 1;
		            break;
		    	  }
		     }
			 if (flag == 0) {
		         System.out.println(num1);
			 }
		         num1++;
		   
		}
}
		
}
