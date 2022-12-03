package abstractFactory;

public class FactoryProvider {
	
	public AbstractFactory getParentFactory(String parentFactory){
		if(parentFactory == null){
			return null;
		}else if(parentFactory.equalsIgnoreCase("animal")){
			return new AnimalFactory();
		}else if(parentFactory.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}

}
