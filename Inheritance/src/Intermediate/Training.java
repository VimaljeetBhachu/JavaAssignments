package Intermediate;

import org.apache.log4j.Logger;

public abstract class Training {

	static Logger logger = Logger.getLogger(Training.class);

	public int id;
	public String subject;
	public double fees;

	public Training(String subject, double fees) {
		this.subject = subject;
		this.fees = fees;
	}

	public abstract double getOrderValue();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}
}
