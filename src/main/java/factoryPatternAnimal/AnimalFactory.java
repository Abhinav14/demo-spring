package factoryPatternAnimal;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(String type) {
		if(type.equalsIgnoreCase("dog")){
			return new Dog();
		}else if(type.equalsIgnoreCase("duck")){
			return new Duck();
		}else if(type.equalsIgnoreCase("bear")){
			return new Bear();
		}
		return null;
	}

}
