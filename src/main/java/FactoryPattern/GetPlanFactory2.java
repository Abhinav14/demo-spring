package FactoryPattern;

public class GetPlanFactory2 {
	
	public Plan2 getPlan(String planType){
		if(planType == null){
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")){
			return new DomesticPlan2();
		}else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan2();
		}else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return new InstitutionalPlan2();
		}
		return null;
	}
	
}
