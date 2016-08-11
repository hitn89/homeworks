package Lesson20160704;

public class PassByValue {

	public static void main(String[] args) {
		
		int x = 10;
		
		process(x);
		
	}

	static void process(final int x) {
		
	//	x = 11; ERROR!
	}
	
}
