package oops_problem;

//Demonstrate safe downcasting using instanceof in an inheritance hierarchy.


class Animall {
 void makeSound() {
     System.out.println("Animal makes sound");
 }
}

class Cat extends Animall {
 void bark() {
     System.out.println("Cat Mews");
 }
}

public class Question16 {
 public static void main(String[] args) {
     Animall a = new Cat(); // Upcasting
     a.makeSound();

     if (a instanceof Cat) { // Safe downcasting check
    	 Cat d = (Cat) a; // Downcasting
         d.bark();
     } else {
         System.out.println("Not a Cat instance");
     }
 }
}
