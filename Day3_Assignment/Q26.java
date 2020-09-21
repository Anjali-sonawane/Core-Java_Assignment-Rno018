import java.util.Scanner;

public class Q26 {

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int arr[][] = new int[5][17];
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter element");
		arr[i][j]=sc.nextInt();
		sum=sum+arr[i][j];
		}

	}
	System.out.println("sum of element :"+sum);
	
	}
}