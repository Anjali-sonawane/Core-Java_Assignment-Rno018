import java.util.Scanner;

public class Q17 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  number");
		int  num =s.nextInt();
		int rev =0;
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 +digit;
			num/=10;
		}
		System.out.println("reverse of given number:"+rev);
	}
}
