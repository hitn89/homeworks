package Lesson20160704;

public class B {

	
	// 1 выполняется один раз
	static {
		System.out.println("static");
	}
		
	// 3 идет после инстенса
	public B() {
		System.out.println("constructor");
	}
	
	
	// выполняемся перед конструктором
	{
		System.out.println("instatnce");
	}

	static {
		System.out.println("static2");
	}
	
	{
		System.out.println("instatnce2");
	}
	
}
