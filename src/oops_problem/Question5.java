package oops_problem;
//Create two references pointing to the same object and show how changing data in one reference affects the other.


public class Question5 extends Student1 {

    public static void main(String[] args) {
        Student1 s1 = new Student1();


        s1.setName("raj");

        System.out.println("before valeu of s1.setname " + s1.getName());
        Student1 s2 = s1;

        s2.setName("Intiyaj");

        System.out.println("after chage value ");
        System.out.println("s1 " + s1.getName());
        System.out.println("s2 " + s2.getName());

    }
}

