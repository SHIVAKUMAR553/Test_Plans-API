package com.insurancePlan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurancePlan.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity, Integer>{

}
