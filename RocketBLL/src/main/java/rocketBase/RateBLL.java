package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketData.LoanRequest;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		ArrayList<RateDomainModel> AllRates = RateDAL.getAllRates();
		
		for(int i = 0;i < AllRates.size();i++){
			if(AllRates.get(i).getiMinCreditScore()<GivenCreditScore){
				dInterestRate = AllRates.get(i).getdInterestRate();
			}
			else {
				throw new RateException(null);
			}
		}
		return dInterestRate;
	}				
		
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
