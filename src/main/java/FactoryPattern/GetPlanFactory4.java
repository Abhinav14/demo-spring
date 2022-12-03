package FactoryPattern;

public class GetPlanFactory4 {
	public Plan4 getPlan(String planName){
		if(planName == null){
			return null;
		}else if(planName.equalsIgnoreCase("DOMESTICPLAN")){
			return new DomesticPlan4();
		}else if(planName.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan4();
		}else if(planName.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return new InstitutionalPlan4();
		}
		return null;
	}
}
