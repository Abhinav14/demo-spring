package factoryPatternAnimal;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("animal")){
			return new AnimalFactory();
		}else if(choice.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
}
