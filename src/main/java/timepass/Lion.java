package timepass;

public class Lion implements Animal{

	@Override
	public void move() {
		System.out.println("I am a Lion and I walk.");
	}

	@Override
	public void eat() {
		System.out.println("I am a Lion and I eat meat.");
	}

	@Override
	public void sound() {
		System.out.println("I am a Lion and I roar.");
	}

}
