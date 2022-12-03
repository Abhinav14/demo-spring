package abstractFactory;

public class FactoryProducer {
	public static AbstractFactoryShape getFactory(boolean rounded){
		if(rounded){
			return new RoundedShapeFactory();
		}else{
			return new ShapeFactory();
		}
	}
}
