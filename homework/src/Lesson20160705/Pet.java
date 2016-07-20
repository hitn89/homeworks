package Lesson20160705;

public class Pet {

	public void feed() {
		System.out.println("Животное больше не голодное");
	}
	
	public void walk() {
		System.out.println("Вы гуляете со своим животным");
	}
	
	public void play() {
		System.out.println("Играю с животным");
	} 	
	
	public void care() {
		this.feed(); // можно без this
		this.walk();
		this.play();
		
		special();
		
//		if(this instanceof MammalPetWithFur){  замена этого куска в mammal..
//			((MammalPetWithFur)this).comb();
//		}
	}

	public void special() {
		// TODO Auto-generated method stub
		
	}
	
}
