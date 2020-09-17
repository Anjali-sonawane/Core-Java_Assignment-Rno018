import java.util.*;
public class Q13 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
	/*	if(num1>num2 && num1>num3) {
			System.out.println("Num1 is greater");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Num 2 is greater");
		}
		else {
			System.out.println("Nume 3 is greater");
		}
	*/
	int z=  num1>(num2>num3 ? num2:num3)?num1:((num2>num3?num2:num3));
	System.out.println("greater number is:"+z);
	
	}
	
}
