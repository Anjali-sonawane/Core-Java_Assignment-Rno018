import java.util.Scanner;

class Employee{
	static int count;
	static int totalSalary;
	int empNo;
	int salary;
	

	void get(int emp,int salary) {
				this.salary=salary;
		
				this.empNo++;

	}
	void calculate(){
		count=count+1;
		totalSalary = totalSalary +salary;
		
	}
	void show() {
		System.out.println("emp details :"+empNo+" , "+salary+" , "+totalSalary);
		System.out.println("total no of emp: "+count);
		System.out.println("total salary of emp: "+totalSalary);
	}
}
public class Q38 {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("how many employee you want to store");
	int n= s.nextInt();
	int ar[]=new int[n];
	
	for(int i=0;i<ar.length;i++) {
		System.out.println("enter EmpNo,Salary");
		int empno = s.nextInt();
		int salary = s.nextInt();
		Employee e = new Employee();
		e.get(empno, salary);
		e.calculate();
		e.show();
	}
}
}
