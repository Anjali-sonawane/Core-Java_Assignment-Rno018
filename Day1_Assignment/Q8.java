import java.util.Scanner;

public class Q8 {

	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		int amt = sc.nextInt();
		
		System.out.println("Enter Rate ");
		int rate = sc.nextInt();
		
		System.out.println("Enter Time");
		int time = sc.nextInt();
		
		int SI = (amt * rate * time);
		System.out.println("Simple Intrest: "+ SI);
		
	}
	
}
