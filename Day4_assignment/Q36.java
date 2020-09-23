import java.util.Scanner;

class MathOperation{
	int number;
	
	void multiply(int num1,int num2) {
		int IntMulti = num1* num2;
		System.out.println("multiplication of two int number "+IntMulti);
	}
	void multiply(float num1,float num2,float  num3) 
	{
		double floatmulti = num1* num2 * num3;
		System.out.println("multiplication of three float number "+floatmulti);
	}
	void multiply(double num1,int num2) 
	{
		double doublemulti = num1 * num2;
		System.out.println("multiplication of two  number "+doublemulti);
	}
	
}

public class Q36 {
	

	public static void main(String args[]) {
	Scanner s =new Scanner(System.in);
		MathOperation m =new MathOperation();
		m.multiply(10, 20);
		m.multiply(10.3f, 1.12f, 11.2f);
		m.multiply(800.80, 2);
		
		MathOperation arr[] = new MathOperation[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter number");	
			int number = s.nextInt();
		}
		
		
		
		
	}
}
