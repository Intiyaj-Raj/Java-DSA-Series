package staticKeywordProblem;
//Create a class Employee with a final variable employeeId that must be
// initialized only once using a constructor (not directly). Then, create multiple
// employee objects and display their details. Requirements: Declare final int employeeId;
// Initialize it inside a constructor. Also include String name and double salary as regular variables.
// Print details for multiple employees to show how final variable gets unique values per object.
class Employee {
    final int employeeId;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}

public class Question4 {
    public static void main(String[] args) {
        // creating multiple employee objects
        Employee e= new Employee(101, "intiyaj", 345445.345);

        System.out.println(e.toString());
    }

}