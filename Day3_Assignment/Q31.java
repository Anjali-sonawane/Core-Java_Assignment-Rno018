
class student {

	private int Rno;
	private String Name;
	void  setData(int rno,String name) {
		Rno =rno;
		Name = name;
		
	}
	void showData() {
		System.out.println(Rno+" "+Name);
	}
	
	
}
class Q31{
	public static void main(String args[]) {
		student s =new student();
		s.setData(101, "Anjali");
		s.showData();
	}
}