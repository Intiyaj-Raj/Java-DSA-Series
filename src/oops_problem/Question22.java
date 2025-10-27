package oops_problem;

//Create a class User with a private password and validate it using a setter method (must be more than 8 characters).

class User {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void checkPass() {
		if (password.length() >= 8) {
			System.out.println("password  set successfully");
		} else {
			System.out.println("please enter password more than or equal to 8 characters");
		}
	}
}

public class Question22 {

	public static void main(String[] args) {
		User u = new User();

		u.setPassword("i234");
		System.out.println(u.getPassword());
		u.checkPass();

		u.setPassword("int9117@#");
		System.out.println(u.getPassword());
		u.checkPass();
	}
}
