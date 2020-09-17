import java.util.Scanner;

public class Q12 {
	public static void main(String args[])
	{
		float bs, gs, da, hra;
		System.out.println("Enter basic salary (In Rs.):");
		Scanner s = new Scanner(System.in);
		bs=s.nextFloat();
	
		if (bs<1500)
			{
				hra = bs * 10 / 100;
				da = bs * 90 / 100;
			}
		else
			{
				hra = 500;
				da = bs * 98 / 100;
			}
		gs = bs + hra + da;
		System.out.println("You Entered Basic Salary = "+bs);
		System.out.println("HRA= "+hra);
		System.out.println("DA = "+da);
		System.out.println("Gross salary GS = "+gs);
		
	}
}
