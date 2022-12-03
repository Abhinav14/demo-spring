package abstractFactory;

public class Duck implements Animal{

	@Override
	public void eat() {
		System.out.println("I am Duck, and I eat grains.");
	}

	@Override
	public void speak() {
		System.out.println("Quack quack");
	}

}
