package oops_problem;


//Show constructor chaining using super() keyword in parent and child classes.

class Parent{
	int n = 10;
	
	void print() {
		System.out.println("Before changing value of n " + n);
	}
	
	Parent(){
		System.err.println("Parent Constructor call");
	}
}
class Child extends Parent{
	
	void show() {
		super.n = 11;
	System.out.println("After change value of n "+ n);
	}
	
	
	Child(){
		super();
		System.out.println("Child Constructor call");
	}
}

public class Question18 {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		c.show();
	}

}
