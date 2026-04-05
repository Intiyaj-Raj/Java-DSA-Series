package staticKeywordProblem;


//Create a class DatabaseConfig that initializes a static variable DB_URL inside a static block.
//Print a message when the static block runs, and also print the value of DB_URL from the main() method.
//Also, create one object of the class and check whether the static block runs again or not.
//
//Static block runs only once when the class is loaded into memory.
//
//Try printing a message inside the constructor to compare.

class DatabaseConfig {

    static String DB_URL;


    static {
        DB_URL = "www.databaseurl.co.in";
        System.out.println("i am a static block");
    }

}

public class Question3 {
    public static void main(String[] args) {
        System.out.println(DatabaseConfig.DB_URL);

        DatabaseConfig obj = new DatabaseConfig();
    }
}
