package Lesson20160705;

public abstract class MammalPetWithFur extends Pet{
	
	abstract public void comb();

	@Override
	public void care() {
		super.care();
		comb();
	}
	
}
