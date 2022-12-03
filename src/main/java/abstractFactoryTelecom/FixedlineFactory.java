package abstractFactoryTelecom;

public class FixedlineFactory implements AbstractFactory{

	@Override
	public Plan getPlan(String planName) {
		if(planName.equalsIgnoreCase("fixedline-monthly")){
			return new Fixedline_Monthly();
		}else if(planName.equalsIgnoreCase("fixedline-annual")){
			return new Fixedline_Annual();
		}
		return null;
	}

}
