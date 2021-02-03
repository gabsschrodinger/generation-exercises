package javaInheritance;

public class ManufacturingWorker extends Employee{
	private double productionValue;
	private float comissionRate;
	
	public ManufacturingWorker(String name, String address, String phone, int departmentCode, double baseSalary, int salaryTaxRate, double productionValue, float comissionRate) {
		super(name, address, phone, departmentCode, baseSalary, salaryTaxRate);
		this.productionValue = productionValue;
		this.comissionRate = comissionRate;
	}
	
	public double productionComission() {
		return (productionValue*comissionRate/100);
	}
	
	public double netSalaryAndComission() {
		return ((baseSalary + productionComission()) * (1 - (double) salaryTaxRate / 100));
	}

	public double getProductionValue() {
		return productionValue;
	}

	public void setProductionValue(double productionValue) {
		this.productionValue = productionValue;
	}

	public float getComission() {
		return comissionRate;
	}

	public void setComission(float comission) {
		this.comissionRate = comission;
	}
	
}
