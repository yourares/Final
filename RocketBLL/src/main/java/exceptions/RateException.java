package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	private RateDomainModel ratedomainmodel;
	
	public RateException(RateDomainModel rdm){
		ratedomainmodel=rdm;
	}
	
	public RateDomainModel getratedomainmodel(){
		return ratedomainmodel;
	}
}
