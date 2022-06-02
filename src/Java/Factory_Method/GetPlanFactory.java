package Java.Factory_Method;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }if(planType.equals("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if(planType.equals("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equals("INSTUTIONALPLAN")){
            return new InstitutionalPlan();
        }return null;
    }
}
