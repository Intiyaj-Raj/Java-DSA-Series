package oops_problem;

//Create classes Employee, Manager, and Developer where both subclasses inherit from Employee. Print their information.

// name or salary in employee see in question 6

class Manager extends Employee{
	String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary +" department=" + department + "]";
	}
	
}

class Developer extends Employee{
	String Language;

	public Developer(String name, double salary, String language) {
		super(name, salary);
		Language = language;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary +" Language=" + Language + "]";
	}
	
}
public class Question17 {
	
	public static void main(String[] args) {
		
		Manager m =  new Manager("Deva",99999,"IT");
		System.out.println(m.toString());
		
		System.out.println();
		
		Developer d = new Developer("Intiyaj" , 53233, "java developer");
		System.err.println(d.toString());
	}

}
