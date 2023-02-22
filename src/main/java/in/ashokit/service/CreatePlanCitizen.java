package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.CreatPlan;
import in.ashokit.entity.AppPlan;

public interface CreatePlanCitizen {
	
	public String createPlan(CreatPlan creatplan);

	public String deletePlan(Integer planId);

	public String getplan(Integer planId);

	public List<AppPlan> getAllPlan();

	public CreatPlan editPlan(Integer AccId);
	

}
