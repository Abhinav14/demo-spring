package factoryPatternAnimal;

public class ColorFactory implements AbstractFactory<Color>{

	@Override
	public Color create(String type) {
		if(type.equalsIgnoreCase("white")){
			return new White();
		}else if(type.equalsIgnoreCase("black")){
			return new Black();
		}else if(type.equalsIgnoreCase("brown")){
			return new Brown();
		}
		return null;
	}

}
