package factoryPatternAnimal;

public class TestAbstractAnimalFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory parentFactory = FactoryProvider.getFactory("animal");
		Animal duck = (Animal) parentFactory.create("duck");
		duck.getAnimal();
		parentFactory = FactoryProvider.getFactory("color");
		Color white = (Color) parentFactory.create("white");
		white.getColor();
	}
}
