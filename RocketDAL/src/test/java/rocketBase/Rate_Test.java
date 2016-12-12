package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	//TODO - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	
	@Test
	public void goodRateTest() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		int credScore = 775;
		double rate = 0;
		
		for (RateDomainModel r : rates) {
			if (credScore >= r.getiMinCreditScore()) {
				rate = r.getdInterestRate();
				break;
			}
		}
		
		assertEquals(3.75,rate,.00001);
	}
	
	/*@Test
	public void exTest() {
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
		int credScore = 500;
		double rate = 0;
		
		try {
			for (RateDomainModel r : rates) {
				if (credScore >= r.getiMinCreditScore()) {
					rate = r.getdInterestRate();
					break;
				}
			}
		} catch (RateException e) {
			
		}
	}*/
}