package oops_problem;

//Create an abstract class Account with method calculateInterest(), implemented by subclasses Savings and Current.

abstract class Account {
	abstract void calculateInterest();
}

class Savings extends Account {
	public void calculateInterest() {
		System.out.println("saving account interest: 2%");
	}
}

class Current extends Account {
	void calculateInterest() {
		System.out.println("current account interest: 0%");
	}
}

public class Question21 {

	public static void main(String[] args) {
		Account s = new Savings();
		s.calculateInterest();

		Account c = new Current();
		c.calculateInterest();
	}
}
