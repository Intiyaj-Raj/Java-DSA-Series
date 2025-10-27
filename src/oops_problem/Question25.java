package oops_problem;

//Create classes Address and Student. Use Address object inside Student class to demonstrate aggregation.

class Address {
	String city, state;

	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}

class Studenttt {
	String name;
// Has-A
	Address address;

	Studenttt(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

}

public class Question25 {
	public static void main(String[] args) {
		Address ad = new Address("Patna", "Bihar");
		Studenttt s = new Studenttt("Intiyaj", ad);
		System.out.println(s.toString());
	}
}
