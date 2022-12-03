package timepass;

public class Eagle implements Animal{

	@Override
	public void move() {
		System.out.println("I am Eagle and I fly.");
	}

	@Override
	public void eat() {
		System.out.println("I am an Eagle and I eat meat.");
	}

	@Override
	public void sound() {
		System.out.println("I am an Eagle and I make screeching sound.");
	}

}
