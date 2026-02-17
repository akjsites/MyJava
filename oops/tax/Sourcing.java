package com.aswini.tax;

public class Sourcing {
	private int SourcingId;
	private String SourcingName;
	private double SourcingbasicSalary;
	private double SourcingHRAper;
	private double SourcingDAper;
	private int enrollmentTarget;
	public int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(int sourcingId, String sourcingName, double sourcingbasicSalary, double sourcingHRAper,
			double sourcingDAper, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		SourcingId = sourcingId;
		SourcingName = sourcingName;
		SourcingbasicSalary = sourcingbasicSalary;
		SourcingHRAper = sourcingHRAper;
		SourcingDAper = sourcingDAper;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary()
	{
		return SourcingbasicSalary +SourcingHRAper +SourcingDAper+(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);

	}
}
