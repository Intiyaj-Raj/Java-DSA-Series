package oops_problem;

//27. Create two interfaces A and B, and another interface C extending both. Implement C in a class.
interface Ae {
	void showA();
}

interface Be {
	void showB();
}

interface C extends Ae, Be {
	void showC();
}

class Demo implements C {
	public void showA() {
		System.out.println("Interface A method");
	}

	public void showB() {
		System.out.println("Interface B method");
	}

	public void showC() {
		System.out.println("Interface C method");
	}
}

public class Question27 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.showA();
		d.showB();
		d.showC();
	}
}
