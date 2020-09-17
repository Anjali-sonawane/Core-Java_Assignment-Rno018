public class Q3 {
	public static void main(String args[]) {
	
	int x=5;
		int y=(x*x+3*x-7);
		System.out.println(y);
		System.out.println(x++ + ++x);
		int z=(x++ - --y - --x  +  x++);
		System.out.println(z);
		
		int a=1;
		int b=0;
		int s = a && b || !(a || b);
		System.out.println(s);
		
		
	}
	
}
