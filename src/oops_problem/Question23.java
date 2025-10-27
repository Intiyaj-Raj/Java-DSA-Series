package oops_problem;

// Create interface Payment and implement in CreditCard and UPI classes. Call common method using interface reference.
interface Payment {
	void makePayment();
}

class CreditCard implements Payment {
	public void makePayment() {
		System.out.println("Payment done using Credit Card");
	}
}

class UPI implements Payment {
	public void makePayment() {
		System.out.println("Payment done using UPI");
	}
}

public class Question23 {
	public static void main(String[] args) {
		Payment p1 = new CreditCard();
		p1.makePayment();

		Payment p2 = new UPI();
		p2.makePayment();
	}
}
