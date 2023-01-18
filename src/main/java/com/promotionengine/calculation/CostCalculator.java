package com.promotionengine.calculation;

public class CostCalculator {
	

	public static final int PRICE_SKUA = 50;
	public static final int PRICE_COMBO_SKUA = 130;
	public static final int PRICE_SKUB = 30;
	public static final int PRICE_COMBO_SKUB = 45;
	public static final int PRICE_SKUC = 20;
	public static final int PRICE_SKUD = 15;
	public static final int PRICE_COMBO_SKUCD = 30;
	public int total =0;
	
	
	public int calculateTotalCost(int quantA, int quantB, int quantC, int quantD ) {
		
		
		  total = calculateCostSkuIdA(quantA, total);
		  total = calculateCostSkuIdB(quantB, total);
		  total = calculateCostSkuIdCAndD(quantC, quantD, total);
		
		
		return total ;
	}


	private int calculateCostSkuIdA(int quantA, int total) {
		if (quantA >= 3) {
			int q = quantA / 3;
			int r = quantA % 3;

			total = (q >= 0) ? total + q * PRICE_COMBO_SKUA : total;

			total = (r >= 0) ? total + r * PRICE_SKUA : total;
		} else {

			total = total + quantA * PRICE_SKUA;
		}
		
		return total;
	}

	private int calculateCostSkuIdB(int quantB, int total) {
		if (quantB >= 2) {
			int q = quantB / 2;
			int r = quantB % 2;

			total = (q >= 0) ? total + q * PRICE_COMBO_SKUB : total;

			total = (r >= 0) ? total + r * PRICE_SKUB : total;
		} else {

			total = total + quantB * PRICE_SKUB;
		}
		
		return total;
	}
	
	private int calculateCostSkuIdCAndD(int quantC, int quantD, int total) {
		
		if(quantC >=1 && quantD >=1 ) {
			
			total = (quantC == quantD ) ? total + quantC*PRICE_COMBO_SKUCD : total;
			
			total = (quantC > quantD ) ?  total + (quantD*PRICE_COMBO_SKUCD  + (quantC - quantD )*PRICE_SKUC) : total ;
			
			total = (quantD > quantC ) ?  total + (quantC*PRICE_COMBO_SKUCD  + (quantD - quantC )*PRICE_SKUD) : total;
			
		}else {
			total =total + quantC * PRICE_SKUC;
			
			total =total + quantD * PRICE_SKUD;
		}
		return total;
	}
	
	
}
