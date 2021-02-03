package javaInheritance;

public class Manager extends Person{
	private double travelAllowance;
	
	public Manager(String name, String address, String phone, double travelAllowance) {
		super(name, address, phone);
		this.travelAllowance = travelAllowance;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}
	
}
