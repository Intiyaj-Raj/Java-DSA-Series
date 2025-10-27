package basic_questions;
/*
 * WriteaJavaprogramtodeclarevariablesofallprimitivedatatypesand
print their default and assigned values
 * */ 

class PrimitiveData{
	
	int a;
	float b;
	double c;
	byte d;
	short e;
	long f;
	char g;
	boolean h;
	
	
	void printAssignValue() {
		
//		 assign value 
		 a = 10;
		 b = 10.5f;
		 c = 3.1453234d;
		
		 d = 10;
		 e = 11;
		 f = 10111111111000000l;
		 g = 'i';
		h = true;

		System.out.println("Primitives Data Type Assign value ");
		
		System.out.println("int: "+ a);
		System.out.println("float: "+b);
		System.out.println("double: "+c);
		System.out.println("byte: "+d);
		System.out.println("short:"+e);
		System.out.println("long: "+f);
		System.out.println("char: "+g);
		System.out.println("boolean: "+ h);
	}
	
	void printDefaultValue() {
	System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("int: "+ a);
	
		System.out.println("float: "+b);
		System.out.println("double: "+c);
		System.out.println("byte: "+d);
		System.out.println("short:"+e);
		System.out.println("long: "+f);
		System.out.println("char: "+g);
		System.out.println("boolean: "+ h);
	}
	
}
public class PrimitivesDataTypes {

	public static void main(String[] args) {
		
		PrimitiveData ob = new PrimitiveData();
		ob.printAssignValue();
		ob.printDefaultValue();
	}
}
