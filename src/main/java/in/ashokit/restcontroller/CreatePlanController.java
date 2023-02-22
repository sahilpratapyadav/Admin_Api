package in.ashokit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CreatPlan;
import in.ashokit.entity.AppPlan;
import in.ashokit.service.CreatePlanCitizen;

@RestController
public class CreatePlanController {
	@Autowired
	private CreatePlanCitizen plancitizen;
	
    @PostMapping("/plan")
	public String createPlan(@RequestBody CreatPlan creatplan) {

		String createPlan = plancitizen.createPlan(creatplan);
		return "plan is created";

	}
    
    @GetMapping("/delette/{planId}")
	public String deletePlan(@PathVariable("planId") Integer planId) {

    	plancitizen.deletePlan(planId);
		return "plan  is deleted " + planId;

	}

	@GetMapping("/getplan/{planId}")
	public String getAccountOfCaseWorker(@PathVariable("planId") Integer planId) {
		String getplan = plancitizen.getplan(planId);

		return "plan is  get with id" + getplan;

	}

	@GetMapping("/getAllPlan")
	public String getAllAccountOfCaseWorker() {

		 List<AppPlan> allPlan = plancitizen.getAllPlan();
		return "get all Plan" + allPlan;

	}
/*
	@GetMapping("/edit")
	public CaseWorkerAccount editCaseWorkerAccounts(Integer AccId) {
		return null;

	}
*/
    
    

}
