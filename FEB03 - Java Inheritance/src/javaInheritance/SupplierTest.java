package javaInheritance;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier[] supplierList = new Supplier[3];
		supplierList[0] = new Supplier("Sabrina Beezos", "New York Avenue", "4002-8922", 9863.5, 500.8);
		supplierList[1] = new Supplier("Ronald Donald", "Atlanta Street", "0000-0000", 9650.4, 96344.2);
		supplierList[2] = new Supplier("Cody Ka", "Texas Roadway", "4826-1202", 354144, 3746.7);
		
		System.out.println("Supplier's info:\n");
		for(int i = 0; i < 3; i++) {
			supplierList[i].printInfo();
		}
		
		System.out.println("\n\n\nSupplier's balance:\n");
		for(int i = 0; i < 3; i++) {
			System.out.println("Supplier: " + supplierList[i].getName() + "  -  Balance: " + supplierList[i].getBalance());
		}
	}
}
