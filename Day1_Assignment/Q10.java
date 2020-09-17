import java.util.*;
public class Q10 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit ");
		int Fahrenheit  = sc.nextInt();
		
		int celsius = (5*(Fahrenheit-32)/9);
		System.out.println("celsius: " +celsius);
		
	}
}
