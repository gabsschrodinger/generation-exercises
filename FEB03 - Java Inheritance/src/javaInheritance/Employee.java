package javaInheritance;

public class Employee extends Person{
	protected int departmentCode;
	protected double baseSalary;
	protected int salaryTaxRate;
	
	public Employee(String name, String address, String phone, int departmentCode, double baseSalary, int salaryTaxRate) {
		super(name, address, phone);
		this.departmentCode = departmentCode;
		this.baseSalary = baseSalary;
		this.salaryTaxRate = salaryTaxRate;
	}
	
	public double salaryCalculator() {
		return (baseSalary*(1-(double) salaryTaxRate/100));
	}
	
	public void printEmployeeInfo() {
		System.out.println("Employee: " + name + "  -  Department code: " + departmentCode);
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getSalaryTaxRate() {
		return salaryTaxRate;
	}

	public void setSalaryTaxRate(int salaryTaxRate) {
		this.salaryTaxRate = salaryTaxRate;
	}
	
}
