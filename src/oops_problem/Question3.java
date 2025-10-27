package oops_problem;

//Create a class Book that uses a default constructor to print “Book object created”.
class Book {
	Book() {
		System.out.println("Hii,  I am a default constructor ");
		System.out.println("Book object created");
	}
}

class Question3 {

	public static void main(String[] args) {
		Book b = new Book();
	}
}
