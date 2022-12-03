package abstractFactoryTelecom;

public class PrepaidFactory implements AbstractFactory{

	@Override
	public Plan getPlan(String planName) {
		if(planName.equalsIgnoreCase("prepaid-monthly")){
			return new Prepaid_Monthly();
		}else if(planName.equalsIgnoreCase("prepaid-annual")){
			return new Prepaid_Annual();
		}
		return null;
	}

}
