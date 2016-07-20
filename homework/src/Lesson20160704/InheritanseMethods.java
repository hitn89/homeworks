package Lesson20160704;

public class InheritanseMethods {

	static class A {
		
		int calc() {
			return 2 * 2;
		}
		
	}
	
	static class B extends A {
	@Override
	int calc() {
		return 10 + super.calc();
	}
	}
	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.calc());

		B b = new B();
		System.out.println(b.calc());
	}
}
