package timepass;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory animalFactory = FactoryProducer.getFactory("water");
		Animal orca = animalFactory.getAnimal("orca");
		orca.move();
		
	}

}
