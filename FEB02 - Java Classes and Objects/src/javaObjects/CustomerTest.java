package javaObjects;

import javaObjects.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		customerList[0] = new Customer("Jefferson Smith", 5000, 123456, "jeff@gmail.com");
		customerList[1] = new Customer("Sabrina Beezos", 0, 789456, "sa@yahoo.com");
		customerList[2] = new Customer("Marcel Lewis", 5, 522300, "mlewis@outlook.com");
		
		customerList[0].setDebt(3000);
		customerList[0].customerDebt();
		
		System.out.println(customerList[0].getDebt());
		
		for(Customer i : customerList) {
			i.customerDebt();
		}
	}
}