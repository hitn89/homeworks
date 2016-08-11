package Lesson20160705;

public class Specialization {

	static class Pet {
	
		public void feed() {
			System.out.println("feeding pet");
		}
		
	}
	
	static class Cat extends Pet {
		
		@Override
		public void feed() {
			super.feed();
			murr();
		}
		
		public void combBehaendEar() {
			murr();
		}

		private void murr() {
			// TODO Auto-generated method stub
			
		}
	}
	
}
