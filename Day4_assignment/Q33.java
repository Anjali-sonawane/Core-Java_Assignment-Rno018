
class student {

	private int Rno;
	private String Name;
	void  setData(int Rno,String Name) {
		this.Rno =Rno;
		this.Name = Name;
		
	}
	void showData() {
		System.out.println(Rno+" "+Name);
	}
	
	
}
class Q33{
	public static void main(String args[]) {
		student s =new student();
		student s1 =new student();
		s.setData(101, "Anjali");
		s.showData();
		s1.setData(102, "sonawane");
		s1.showData();
	}
}
