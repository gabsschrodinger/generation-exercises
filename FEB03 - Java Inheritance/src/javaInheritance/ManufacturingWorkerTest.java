package javaInheritance;

public class ManufacturingWorkerTest {
	public static void main(String[] args) {
		ManufacturingWorker[] factorWorkers = new ManufacturingWorker[2];
		factorWorkers[0] = new ManufacturingWorker("Robert Louis", "Generation Street", "1111-1111", 111, 10000, 15, 25000, 3.5f);
		factorWorkers[1] = new ManufacturingWorker("Wagner Moore", "Generation Street", "2222-2222", 111, 10000, 15, 25000, 3.5f);
		
		System.out.println("Manufacturing workers' net salairies:\n");
		for(ManufacturingWorker i : factorWorkers) {
			System.out.println("Employee: " + i.getName() + "  -  Net Salary: " + i.netSalaryAndComission());
		}
	}
}
