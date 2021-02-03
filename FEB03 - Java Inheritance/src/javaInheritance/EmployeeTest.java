package javaInheritance;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] employeeList = new Employee[5];
		employeeList[0] = new Employee("Light Yagami", "Tokyo", "4444-4444", 444, 10000, 17);
		employeeList[1] = new Employee("Julian Campbell", "Washington", "2309-4454", 155, 1250, 1);
		employeeList[2] = new Employee("Jessica Owrell", "Berlin", "1495-8280", 369, 5200, 7);
		employeeList[3] = new Employee("Ferdinand Rosas", "Buenos Aires", "3854-2217", 321, 8000, 10);
		employeeList[4] = new Employee("François Chateao", "Nice", "9287-5204", 237, 3500, 3);
		
		System.out.println("Employee list:\n");
		for(Employee i : employeeList) {
			i.printEmployeeInfo();
		}
		
		System.out.println("\n*****************************************************\n");
		
		System.out.println("Net salaries:\n");
		for(int i = 0; i < 5; i++) {
			System.out.println("Employee: " + employeeList[i].getName() + "  -  Net salary: " + employeeList[i].salaryCalculator());
		}
	}
}
