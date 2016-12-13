package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	@Test
	public void goodScoreTest() {
		RateBLL test = new RateBLL();
		try {
			assertEquals(3.75, test.getRate(775), .0001);
		} catch (RateException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void badScoreTest() {
		RateBLL test2 = new RateBLL();
		int score = 200;
		String message = "hello";
		try {
			test2.getRate(score);
		} catch (RateException e) {
			message = e.getMessage();
		}

		assertEquals("No rate found for credit score: " + score, message);
	}
}