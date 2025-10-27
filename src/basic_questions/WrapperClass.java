package basic_questions;
// Convert a primitive into Integer(autoboxing)and again convert it back to int(unboxing).Print both results.

public class WrapperClass {

	public static void main(String[] args) {

		int n = 22;
//	autoboxing
		Integer i = n;

//	unboxiing

		int newN = i;

		System.out.println("Autoboxing: " + i);
		System.out.println("Unboxing: " + newN);

		System.out.println("---------------------------------");
//	Take a Strings= "123"; and convert it into an Integer.Then add 10 to it	and print the final result.

		String s = "123";
		int num = Integer.parseInt(s);
		
		int add = num + 10;
		
		
		System.out.println(add);
	}
}
