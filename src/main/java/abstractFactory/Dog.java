package abstractFactory;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("I am Dog, and I eat biscuits.");
	}

	@Override
	public void speak() {
		System.out.println("wuff wuff");
	}

}
