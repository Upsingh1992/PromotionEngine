
package com.promotionengine.main;

import java.util.Scanner;

import com.promotionengine.calculation.CostCalculator;
import com.promotionengine.execute.PromotionEngineExecute;


public class RunEngine {


	public static void main(String[] args) {
		CostCalculator calc = new CostCalculator();
		PromotionEngineExecute p = new PromotionEngineExecute(calc);
		
		System.out.println(" Welcome to ABC.. Promotion Engine !! ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of SKUID A");
		int skuIdA = sc.nextInt();
		
		System.out.println("Enter the value of SKUID B");
		int skuIdB = sc.nextInt();

		System.out.println("Enter the value of SKUID C");
		int skuIdC = sc.nextInt();

		System.out.println("Enter the value of SKUID D");
		int skuIdD = sc.nextInt();
		
		int total = p.execute(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" Total Calculated Cost ==> " + total);
		
	}
	
	
}
