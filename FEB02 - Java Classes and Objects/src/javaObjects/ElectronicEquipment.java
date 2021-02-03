package javaObjects;

import java.util.Scanner;

public class ElectronicEquipment {
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private double price;
	private String producer;
	private String seller;
	
	public ElectronicEquipment(String name, double price, String producer, String seller) {
		this.name = name;
		this.price = price;
		this.producer = producer;
		this.seller = seller;
	}
	
	public void sale(int offRate) {
		if(offRate < 0 || offRate > 100) {
			System.out.println("Inavlid entry! Please, insert an integer between 0 and 100: ");
			offRate = scan.nextInt();
		}
		setPrice(price * (100 - offRate) / 100);
	}
	
	public void sellerInfo() {
		System.out.println("Product: " + name + "  -  Seller: " + seller);
	}
	
	public void priceInfo() {
		System.out.println("Product: " + name + "  -  Price: " + price);
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	
}