package com.promotionengine.calculation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestCalculcateCost {
	
	private CostCalculator test = new CostCalculator();
	
	
	@Test
	public void testCalculation1() {
		int result = test.calculateTotalCost(1,1,1,0);
		
		assertThat(result).isEqualTo(100);
	}
	@Test
	public void testCalculation2() {
		int result = test.calculateTotalCost(5,5,1,0);
		
		assertThat(result).isEqualTo(370);
	}
	
	@Test
	public void testCalculation3() {
		int result = test.calculateTotalCost(3,5,1,1);
		
		assertThat(result).isEqualTo(280);
	}
}
