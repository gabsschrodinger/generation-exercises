package javaInheritance;

public class Seller extends Person{
	private double salesValue;
	private float salesComissionRate;
	
	public Seller(String name, String address, String phone, double salesValue, float salesComissionRate) {
		super(name, address, phone);
		this.salesValue = salesValue;
		this.salesComissionRate = salesComissionRate;
	}
	
	public double salesComission() {
		return (salesValue*salesComissionRate/100);
	}
	
	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public float getSalesComissionRate() {
		return salesComissionRate;
	}

	public void setSalesComissionRate(float salesComissionRate) {
		this.salesComissionRate = salesComissionRate;
	}
	
}
