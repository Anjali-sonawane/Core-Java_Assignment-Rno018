
class Person{
	Person(){                      
		this(45);
		System.out.println("no-arg Person");
	}
     	Person(int i){                 
		System.out.println("param Person");
	}
}
class Employee extends Person{
	Employee(){                  
		this(12);
		System.out.println("no-arg Employee");
	}
	Employee(int i){              
		
		System.out.println("parameter Employee");
	}	
}
class Q41{
	public static void main(String args[]){
		Employee e1 = new Employee();	
	}
}