package FactoryPattern;

public class GetPlanFactory3 {
	public Plan3 getPlan(String planName){
		if(planName == null){
			return null;
		}
		if(planName.equalsIgnoreCase("DOMESTICPLAN")){
			return new DomesticPlan3();
		}else if(planName.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan3();
		}else if(planName.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return new InstitutionalPlan3();
		}
		return null;
	}
}
