import java.util.Scanner;
class Q29{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 2-D array: ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println("Enter a number: ");
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0; i<arr.length; i++){
			System.out.println("Size of "+i+" array is: "+(arr[i].length));
			System.out.println("Elements in "+i+"array are:");
			for(int j=0; j<arr[i].length; j++){
				System.out.print(" "+arr[i][j]);
				
			}
			System.out.println("");
		}
		

	}
}