import java.util.*;
class Faculty{

	int facultyId,salary;
	public void input(int facultyId,int salary) {
		this.facultyId=facultyId;
		this.salary=salary;
		
	}
	public void printSalary(int facultyId, int salary) {
		System.out.println("Faculty ID"+facultyId);
		System.out.println("salary: "+salary);
	}
	
}
class FullTimeFaculty extends Faculty{
int	basicSalary; 
	int allowance;
	int totalSalary;
	public void input(int facultyId,int salary) {
		super.input(facultyId,salary );
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		totalSalary=this.basicSalary+this.allowance;
		
	}
	void show() {
		super.printSalary(facultyId, salary);
		System.out.println("Basic salary: "+basicSalary);
		System.out.println("allownace: "+allowance);
		System.out.println("total salary of full time "+totalSalary);
	}
	
}
class PartTimeFaculty  extends Faculty {
	int workingHours;	
	int ratePerHour;
	int partTimeSalary;
	public void input(int facultyId , int salary,int ratePerHour,int workingHours) {
		super.input(facultyId , salary);
		this.workingHours=workingHours;
		this.ratePerHour=ratePerHour;
		partTimeSalary = workingHours*ratePerHour;
		
	}
	void show() {
		super.printSalary(facultyId, salary);
		System.out.println("Working hours: "+workingHours);
		System.out.println("Rtae per hours: "+ratePerHour);
		System.out.println("taotal salary of part time "+partTimeSalary);
	}
	
}
public class Q44 {

	public static void main(String[] args) {
		System.out.println("enter facultyId and Salary");
		Scanner s = new Scanner(System.in);
		int facultyId = s.nextInt();
		int salary = s.nextInt();
		int ratePerHour= s.nextInt();
		int workingHours=s.nextInt();
		int basicSalary=s.nextInt(); 
		int allowance=s.nextInt();
		PartTimeFaculty p1 =new PartTimeFaculty();
		p1.input(facultyId , salary,ratePerHour,workingHours);
		p1.show();
		FullTimeFaculty f1 = new FullTimeFaculty();
		f1.input(facultyId, salary );
	}

}
