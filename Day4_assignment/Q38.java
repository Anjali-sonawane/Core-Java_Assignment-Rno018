import java.util.Scanner;

class Employee{
	static int empNo;
	int salary;
	int totalSalary=0;
	void get(int empNo,int salary,int totalSalary) {
		this.empNo=empNo;
		this.salary=salary;
		this.totalSalary=totalSalary;
	}
	void calculate(){
		totalSalary =+salary;
		empNo++;
	}
	void show() {
		System.out.println("emp details :"+empNo+salary+totalSalary);
	}
}
public class Q38 {
	public static void main() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter EmpNo,Salary");
	int empNo = s.nextInt();
	int salary = s.nextInt();
	int totalSalary =s.nextInt();
	Employee e = new Employee();
	e.get(empNo, salary, totalSalary);
	e.calculate();
	e.show();
}
}
