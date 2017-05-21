package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	
	@Test
	public void Ratetest() {
		double dInterestRate = 0;
		try {
			dInterestRate = RateBLL.getRate(1000);
		} catch (RateException e) {
			e.printStackTrace();
		}
		assertEquals(dInterestRate, 5.0, 0.2);
	}

	@Test
	public void RateTest() throws RateException {
		assertEquals(RateBLL.getRate(1000), 1.2, 0.02);
	
	}

	@Test
	public void PaymentTest() {
		double Payment = RateBLL.getPayment(0.5 / 12, 12, 5000, 10000, false);
		assertEquals(Payment, 10000, 0.2);
	}

}
