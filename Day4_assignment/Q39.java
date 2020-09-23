import java.util.*;
class product{
	private int pId;
	private int price;
	private int quantity;
	int length;
	void set(int pId,int price,int quantity){
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;

	}
	void highest(int pId,int length) {
		for(int i=0;i<this.length;i++) {
			if(this.pId > )
		}

	}
	void show(){
		System.out.println(pId+" "+price+" "+quantity);
	}
	
}
public class Q39 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		product ar[] = new product[2];
		int length = 
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter pid");	
			int pId = sc.nextInt();
			System.out.println("Enter price");	
			int price = sc.nextInt();
			System.out.println("Enter quantity");	
			int quantity = sc.nextInt();
			product p = new product();
			p.set(pId,price,quantity);
			ar[i] = p;
			p.highest(pId, length);
			
		}
		
		
		for(product a : ar){	
			a.show();
		}
}
}
