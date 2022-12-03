package abstractFactoryTelecom;

public class PostpaidFactory implements AbstractFactory{

	@Override
	public Plan getPlan(String planName) {
		if(planName.equalsIgnoreCase("postpaid-monthly")){
			return new Postpaid_Monthly();
		}else if(planName.equalsIgnoreCase("postpaid-annual")){
			return new Postpaid_Annual();
		}
		return null;
	}

}
