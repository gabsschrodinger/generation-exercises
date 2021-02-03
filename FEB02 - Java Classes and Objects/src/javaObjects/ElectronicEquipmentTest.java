package javaObjects;

import javaObjects.ElectronicEquipment;

public class ElectronicEquipmentTest {
	public static void main(String[] args) {
		ElectronicEquipment electronicList[] = new ElectronicEquipment[5];
		electronicList[0] = new ElectronicEquipment("DVD Player", 150, "Pony", "Bamazon");
		electronicList[1] = new ElectronicEquipment("Smart Watch", 1099.99, "Pineapple", "PineappleStore");
		electronicList[2] = new ElectronicEquipment("SmartPhone", 850, "Kansung", "CellingMart");
		electronicList[3] = new ElectronicEquipment("Laptop", 2900, "Leold", "Bamazon");
		electronicList[4] = new ElectronicEquipment("Smart TV", 1490, "GL", "HawaianHouse");

		
		for(ElectronicEquipment i : electronicList) {
			i.priceInfo();
		}
		
		System.out.println("\n****************************************\n");
		
		for(int i = 0; i < 5; i++) {
			electronicList[i].sale(30);
			electronicList[i].priceInfo();
		}
		
		System.out.println("\n****************************************\n");
		
		for(ElectronicEquipment i : electronicList) {
			i.sellerInfo();
		}
	}
}