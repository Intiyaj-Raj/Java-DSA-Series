package oops_problem;

//Create a base class Shape and a subclass Circle which overrides the area() method.

class Shape {
    void area() {
        System.out.println("Calculating area of shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle =");
    }
}

public class Question10 {
	  public static void main(String[] args) {
	        Circle c = new Circle();
	        c.area();
	    }

}
