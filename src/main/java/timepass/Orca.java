package timepass;

public class Orca implements Animal{

	@Override
	public void move() {
		System.out.println("I am an Orca and I swim.");
	}

	@Override
	public void eat() {
		System.out.println("I am an Orca and I eat Seals.");
	}

	@Override
	public void sound() {
		System.out.println("I am an Orca and I whistle.");
	}

}
