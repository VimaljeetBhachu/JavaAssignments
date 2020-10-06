package Intermediate;

import org.apache.log4j.Logger;

public class CooperateTraining extends Training{

	static Logger logger=Logger.getLogger(Training.class);
	
	private int days;	
	
	public CooperateTraining(String subject,double fees,int days) {
		super(subject,fees);
		logger.info("Days");
		this.days = days;
	}
	
	@Override
	public double getOrderValue() {
		double charges = fees*days;
		logger.info("Charges");
		return charges;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
}
