package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private int credScore;

	public RateException(int score) {
		//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
		//	* Add RateRomainModel as an attribute
		//	* Create a constructor, passing in RateDomainModel
		//	* Create a getter (no setter, set value only in Constructor)
		super("No rate found for credit score: " + score);
		this.credScore = score;
	}
	
	public String getRateExceptionMssg() {
		return this.getMessage();
	}
}