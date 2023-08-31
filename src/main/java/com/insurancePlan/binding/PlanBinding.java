package com.insurancePlan.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanBinding {
	private Integer planId;
	private String planName;
	private Double planPremium;
}
