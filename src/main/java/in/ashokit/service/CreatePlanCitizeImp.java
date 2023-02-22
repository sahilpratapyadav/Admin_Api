package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.CreatPlan;
import in.ashokit.entity.AppPlan;
import in.ashokit.repository.AppPlanRepository;

@Service
public class CreatePlanCitizeImp implements CreatePlanCitizen {
	@Autowired
	private AppPlanRepository repo;

	public String createPlan(CreatPlan creatplan) {
		AppPlan entity = new AppPlan();

		BeanUtils.copyProperties(creatplan, entity);

		repo.save(entity);
		// TODO Auto-generated method stub
		return "plan is created succefull";
	}

	@Override
	public String deletePlan(Integer planId) {
		
		repo.deleteById(planId);
		// TODO Auto-generated method stub
		return "recorde is deleted  id"+planId;
	}

	@Override
	public String getplan(Integer planId) {
		  Optional<AppPlan> findById = repo.findById(planId);
		  
		return "get the value id is"+planId;
	}

	@Override
	public List<AppPlan> getAllPlan() {
		  List<AppPlan> allPlan = repo.findAll();
		return allPlan;
	}

	@Override
	public CreatPlan editPlan(Integer AccId) {
		// TODO Auto-generated method stub
		return null;
	}

}
