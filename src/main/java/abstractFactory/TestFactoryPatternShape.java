package abstractFactory;

public class TestFactoryPatternShape {

	public static void main(String[] args) {
		AbstractFactoryShape shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape("rectangle");
		shape1.draw();
	}

}
