package abstractFactory;

public class AnimalFactory implements AbstractFactory{
	public Animal getAnimal(String type){
		if(type == null){
			return null;
		}else if(type.equalsIgnoreCase("dog")){
			return new Dog();
		}else if(type.equalsIgnoreCase("duck")){
			return new Duck();
		}else if(type.equalsIgnoreCase("bear")){
			return new Bear();
		}
		return null;
	}
}
