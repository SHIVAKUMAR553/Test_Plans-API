package com.insurancePlan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurancePlan.entity.PlanEntity;
import com.insurancePlan.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepository planRepository;
	
	@Override
	public PlanEntity registerPlan(PlanEntity planEntity) {
		PlanEntity resgisteredPlan = planRepository.save(planEntity);
		return resgisteredPlan;
	}

	@Override
	public PlanEntity getPlanById(Integer planId) {
		PlanEntity planById = planRepository.findById(planId).get();
		return planById;
	}

	@Override
	public List<PlanEntity> getAllPlans() {
		List<PlanEntity> allPlans = planRepository.findAll();
		return allPlans;
	}

	@Override
	public PlanEntity updatePlan(Integer planId, PlanEntity planEntity) {
		PlanEntity existingPlan = planRepository.findById(planId).get();
		existingPlan.setPlanName(planEntity.getPlanName());
		existingPlan.setPlanPremium(planEntity.getPlanPremium());
		PlanEntity updatedPlan = planRepository.save(existingPlan);
		return updatedPlan;
	}

	@Override
	public String deletePlan(Integer planId) {
		planRepository.deleteById(planId);
		return "Plan Discontinued Successfully";
	}

}
