package abstractFactoryPractice;

public class TestAbstractFactory {
	public static void main(String[] args) {
		AbstractFactory parentFactory = FactoryProducer.getFactory("air");
		Animal eagle = parentFactory.getAnimal("eagle");
		eagle.name();
	}
}
