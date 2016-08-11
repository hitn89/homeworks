package Lesson20160704;

public class UseA {

	public static void main(String[] args) {
		
		A.staticMethod();
		
		A a = new A();
		
		A.statciMethod(a);
		
//		a.x = 10; Error
		
//		A.globalCount = 0; Error
		
		A a2 = new A(90);
		
		A.printCount();
		
	}
	
}
