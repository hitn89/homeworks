package hw160708;

public class Specialization {

	static class Pet {

		public void feed() {
			System.out.println("pet feeding");
		}
	}

	static class Cat extends Pet {

		public void feed() {
			super.feed();
			murr();
		}

		public void combbehaind() {
			murr();
		}

		private void murr() {
			// TODO Auto-generated method stub

		}

	}

}
