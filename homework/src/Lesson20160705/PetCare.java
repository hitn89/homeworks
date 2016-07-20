package Lesson20160705;

public class PetCare {
	
	public static void main(String[] args) {
		
	Cat cat = new Cat();
	Dog dog = new Dog();
	Turtle turtle = new Turtle();
	Parrot parrot = new Parrot();
	
//	cat.care();
//	dog.care();
//	turtle.care();
	
	care(cat, dog, turtle, parrot);
	
	}
	
	public static void care(Pet... pets){
		for (Pet pet : pets) {
			pet.care();
		}
	}


}
