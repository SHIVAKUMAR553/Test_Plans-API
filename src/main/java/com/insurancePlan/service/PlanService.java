package com.insurancePlan.service;

import java.util.List;

import com.insurancePlan.entity.PlanEntity;

public interface PlanService {

	PlanEntity registerPlan(PlanEntity planEntity);

	PlanEntity getPlanById(Integer planId);

	List<PlanEntity> getAllPlans();

	PlanEntity updatePlan(Integer planId, PlanEntity planEntity);

	String deletePlan(Integer planId);

}
