
class OneBHK
{
	public int roomArea;
	public int hallArea; 
	public int price;

	OneBHK()
	{	
	this.roomArea=0;
	this.hallArea=0; 
	this.price=0;
	}
	OneBHK(int roomArea, int hallArea, int price){
		this.roomArea= roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	void  show() {
		System.out.println("RoomArea: ="+roomArea);
		System.out.println("hallArea: ="+hallArea);
		System.out.println("price: ="+price);
		System.out.println("in ONE BHK==================");
	}
	
}
class TwoBHK extends OneBHK {
	public int room2Area;
	TwoBHK()
	{
		
	this.room2Area=0;
	}
	TwoBHK(int room2Area,int roomArea, int hallArea, int price){
		super(roomArea, hallArea, price);
		this.room2Area=room2Area;
	}
	void  show() {
		super.show();
		System.out.println("room2Area: ="+room2Area);
		/*System.out.println("RoomArea: ="+roomArea);
		System.out.println("hallArea: ="+hallArea);
		System.out.println("price: ="+price);
		*/
		System.out.println("in TWO BHK==================");
	}
}
public class Q43 {

	public static void main(String args[]) {
		//TwoBHK t = new TwoBHK();
		TwoBHK t3 = new TwoBHK(100,200,300,400);
		t3.show();
		
		
	}
}
