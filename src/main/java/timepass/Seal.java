package timepass;

public class Seal implements Animal{

	@Override
	public void move() {
		System.out.println("I am a Seal and I swim.");
	}

	@Override
	public void eat() {
		System.out.println("Ia m a Seal and I eat Penguins.");
	}

	@Override
	public void sound() {
		System.out.println("I am a Seal and I bark.");
	}

}
