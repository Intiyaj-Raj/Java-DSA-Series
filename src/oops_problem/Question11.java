package oops_problem;

//Create a class BankAccount with private data members and public getter and setter methods.

class BankAccount {
	private String accountHolder;
	private double balance;

	public void setAccountHolder(String name) {
		accountHolder = name;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setBalance(double amount) {
		balance = amount;
	}

	public double getBalance() {
		return balance;
	}

}

public class Question11 {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		b.setAccountHolder("Imtiaz");
		b.setBalance(25000.50);

		System.out.println("Account Holder: " + b.getAccountHolder());
		System.out.println("Balance: " + b.getBalance());
	}
}
