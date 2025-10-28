package oops_problem;

//Write a Java class Student with name and age fields, and create an object to display student details.
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


public class Question1 {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Intiyaj");
        s.setAge(20);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());

    }
}

