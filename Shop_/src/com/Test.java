package com;

import com.bill.BillingImpl;
import com.price.F2Inter;
import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P051", "P994" };

		PriceMatrix price=new PriceMatrixImpl();
		
		//--------------------------------------------
		BillingImpl bill = new BillingImpl();
		
		//---------------------------------------
		
		bill.setPrice(price); // DI
		F2Inter f2=new PriceMatrixImpl();
		bill.setF2(f2);
		
		double tot = bill.checkOut(cart1);
		System.out.println("Cart1 total is " + tot);

		tot = bill.checkOut(cart2);
		System.out.println("Cart2 total is " + tot);

	}

}
