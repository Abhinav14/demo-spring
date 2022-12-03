package abstractFactory;

public class ShapeFactory extends AbstractFactoryShape{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}

}
