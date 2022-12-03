package abstractFactory;

public class Bear implements Animal{

	@Override
	public void eat() {
		System.out.println("I am Bear, and I eat honey.");
	}

	@Override
	public void speak() {
		System.out.println("Gurrrrr gurrrrr");
	}

}
