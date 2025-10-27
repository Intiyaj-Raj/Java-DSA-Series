package basic_questions;

public class TypeCasting {
	public static void main(String[] args) {
		
		System.out.println("type casting (widening)");
		
//		Convertanintvaluetodoubleandprintbothvaluesbeforeandafter
		
		int intNum = 6;
		
//		int change to double  automatically
		
		double doubleNum = intNum;
		System.out.println("Before: " +intNum);
		System.out.println("After: " + doubleNum );
		
	
//		Takeadoublevalueandconvertitintoint.Printtheresultandexplain
		
		System.out.println("----------------------");
		System.out.println("narrow type casting");
		
//		change double to int manually
		
		double doubleNum2 = 9.23d;
		int intNum2 = (int)doubleNum2;
		
		System.out.println("Before: "+ doubleNum2);
		System.out.println("After: "+intNum2);
	}
}
