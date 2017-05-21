package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void RateTest() {
		ArrayList<RateDomainModel> Rates = RateDAL.getAllRates();
		System.out.println("Rates Size: " + Rates.size());
		assertTrue(Rates.size() > 0);
	}
}
