package javaObjects;

public class Customer {
	private String name;
	private double debt;
	private int id;
	private String email;
	
	public Customer(String name, double debt, int id, String email) {
		this.name = name;
		this.debt = debt;
		this.id = id;
		this.email = email;
	}
	
	public void customerDebt() {
		if(debt > 0) {
			System.out.println(name + " has a debt of " + debt);
		} else {
			System.out.println(name + " doesn't have any debt.");
		}
	}
	
	public void customerId() {
		System.out.println("Name: " + name + "  -  Id: " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}