package javaInheritance;

public class Supplier extends Person{
	private double creditValue;
	private double debtValue;
	
	public Supplier(String name, String address, String phone, double creditValue, double debtValue) {
		super(name, address, phone);
		this.creditValue = creditValue;
		this.debtValue = debtValue;
	}
	
	public double getBalance() {
		return (creditValue - debtValue);
	}

	public double getCreditValue() {
		return creditValue;
	}

	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}

	public double getDebtValue() {
		return debtValue;
	}

	public void setDebtValue(double debtValue) {
		this.debtValue = debtValue;
	}
	
}
