package Model;

import java.sql.Time;

public class Discount {
    private String discountID;
    private double discountPercent;
    private Time startTime;
    private Time endTime;
    
    public Discount(String discountID, double discountPercent, Time startTime, Time endTime) {
    	this.discountID = discountID;
    	this.discountPercent = discountPercent;
    	this.startTime = startTime;
    	this.endTime = endTime;
    }
    
	public String getDiscountID() {
		return discountID;
	}
	public void setDiscountID(String discountID) {
		this.discountID = discountID;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
}
