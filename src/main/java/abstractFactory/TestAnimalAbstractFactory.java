package abstractFactory;

public class TestAnimalAbstractFactory {

	public static void main(String[] args) {
		FactoryProvider factoryProvider = new FactoryProvider();
		AbstractFactory parentFactProvider = factoryProvider.getParentFactory("animal");
		System.out.println(parentFactProvider.getClass());
	}

}
