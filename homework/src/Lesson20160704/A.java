package Lesson20160704;

public class A {
	
	private static final int NONE = -1;

	private static int globalCount;
	
	private int x;
	
	public A(int x){
		this.x = x;
		globalCount++;
	}
	
	public A() {
		this(NONE);
	}

	public static void staticMethod() {
		System.out.println("static");
//		this.x = 10;		
	}
	
	public static void statciMethod(A a){
		a.x = 10;
	}

	public static void printCount() {
		System.out.println("count = " + globalCount);
		
	}

}
