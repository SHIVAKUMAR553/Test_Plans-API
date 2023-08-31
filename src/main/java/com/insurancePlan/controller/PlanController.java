package com.insurancePlan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.insurancePlan.entity.PlanEntity;
import com.insurancePlan.service.PlanService;

@RestController
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@PostMapping("/register")
	public ResponseEntity<PlanEntity> registerPlan(@RequestBody PlanEntity planEntity){
		PlanEntity registerPlan = planService.registerPlan(planEntity);
		return new ResponseEntity<PlanEntity>(registerPlan, HttpStatus.CREATED);	
	}
	
	@GetMapping("/getPlan/{id}")
	public ResponseEntity<PlanEntity> getPlanById(@PathVariable("id") Integer planId){
		PlanEntity gotPlan = planService.getPlanById(planId);
		return new ResponseEntity<PlanEntity>(gotPlan, HttpStatus.OK);
	}
	
	@GetMapping("/getAllPlans")
	public ResponseEntity<List<PlanEntity>> getAllPlans(){
		List<PlanEntity> allPlans = planService.getAllPlans();
		return new ResponseEntity<List<PlanEntity>>(allPlans, HttpStatus.OK);
	}
	
	@PutMapping("updatePlan/{id}")
	public ResponseEntity<PlanEntity> updatePlan(@PathVariable("id") Integer planId, @RequestBody PlanEntity planEntity){
		PlanEntity updatedPlan = planService.updatePlan(planId, planEntity);
		return new ResponseEntity<PlanEntity>(updatedPlan, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePlan/{id}")
	public ResponseEntity<String> deletePlan(@PathVariable("id") Integer planId){
		String deletePlan = planService.deletePlan(planId);
		return new ResponseEntity<String>(deletePlan, HttpStatus.OK);
		
	}
	
}
