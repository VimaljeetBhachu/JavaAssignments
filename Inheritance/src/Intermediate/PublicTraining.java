package Intermediate;
import org.apache.log4j.Logger;

public class PublicTraining extends Training{

	static Logger logger=Logger.getLogger(Training.class);
	
	private int participants;
	
	public PublicTraining(String subject, double fees, int participants) {
		super(subject,fees);
		this.participants = participants;
	}
	
	@Override
	public double getOrderValue() {
		double charges = fees*participants;
		return charges;
	}
	
	public int getParticipants() {
		return participants;
	}
	
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	
}
