import java.util.Scanner;

public class Q30 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int arr[][] = new int[2][2];
		int diagonal =0;
		System.out.println("enter element");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
			arr[i][j]=sc.nextInt();
			if(i==j) {
				diagonal=diagonal+arr[i][j];
			}
			}
		}
		System.out.println("sum of element in diagonal="+diagonal);
		System.out.println("element in array =");
		for(int ar[] : arr) {
			for(int e : ar) {
				System.out.println(e);	
			}
			
		}
	}
	
}
