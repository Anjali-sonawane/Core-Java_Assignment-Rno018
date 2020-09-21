import java.util.Scanner;

public class Q28 {
	public static void main(String args[]) {
		
		String arr[]=new String[2];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextLine();	
				
		}
		for(String str : arr) {
			System.out.print(str);
		}

	
}
}
