package oops_problem;

//Create a class Employee with variables name and salary, and initialize them using the this keyword.

class Employee{
	 String name;
	 double salary;
	 public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	 }
	 
	 @Override
	 public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	 }
	
	
}
public class Question6 {

	public static void main(String[] args) {
		
		Employee em = new Employee("Intiyaj",63453);
		
		System.err.println(em.toString());		
	}
}

