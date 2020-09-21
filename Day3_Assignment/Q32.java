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
class Q32{
	static int NoOfObject;
	public static void main(String args[]) {
		student s =new student();
		student s1 =new student();
		student s2 =new student();
		s.setData(101, "Anjali");
		s.showData();
		s1.setData(102, "Sonawane");
		s1.showData();
		s2.setData(103, "hb");
		 
		System.out.println(student.NoOfObject);
	}
}
