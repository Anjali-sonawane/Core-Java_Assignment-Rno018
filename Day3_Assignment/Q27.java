import java.util.Scanner;

public class Q27 {


	public static void main(String args[]) {
		
		int arr[]=new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();	
				}

			int max_val = arr[0];
			int min = arr[0];
			for(int i = 1; i < arr.length; i++)
			{
				if(arr[i] > max_val)
					max_val = arr[i];
				else if(arr[i] < min)
					min = arr[i];
			}
			System.out.println("Grestest number in array is: "+max_val);
			System.out.println("smallest number in array is: "+min);
}
}