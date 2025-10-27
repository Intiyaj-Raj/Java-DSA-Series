package oops_problem;


//Demonstrate how Java decides which method to call during runtime using overridden methods.

class Vehicle1 {
 void run() {
     System.out.println("Vehicle is running");
 }
}

class Bike1 extends Vehicle1 {
 void run() {
     System.out.println("Bike is running safely");
 }
}

public class Question20 {
 public static void main(String[] args) {
     Vehicle1 v = new Bike1(); // runtime decision
     v.run(); // calls Bike's run() method
 }
}

