package timepass;

public class Tiger implements Animal{

	@Override
	public void move() {
		System.out.println("I am a tiger and I walk.");
	}

	@Override
	public void eat() {
		System.out.println("I am a tiger and I eat meat.");
	}

	@Override
	public void sound() {
		System.out.println("I am a tiger and I roar.");
	}

}
