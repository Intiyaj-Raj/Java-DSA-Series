package oops_problem;

//Create two interfaces Printable and Showable, and a class Document that implements both.

interface Printable{
	void print();
}

interface Showable {
	void show();
}


class Document implements Printable, Showable{
	public void print() {
		System.out.println("Print Document");
	}
	public void show() {
		System.err.println("Show Document");
	}
}
public class Question14 {

	public static void main(String[] args) {
		Document d = new Document();
		d.print();
		d.show();
	}
}
