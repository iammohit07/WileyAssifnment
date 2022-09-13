
public class Driver {
	public static void main(String[] args) {

		Employee employees[] = new Employee[] 
				{ 
				new Employee(101, "Mohit", "Software Developer", 400000),
				new Employee(102, "Shivam", "Software Developer", 35000), 
				new Employee(103, "Zaid", "Developer", 42000),
				new Employee(104, "Deepak", "API", 45000), 
				new Employee(102, "Sai", "Python Developer", 10000) 
				};
		
		for (Employee employee: employees) {
			employee.calculateGrossSalary();
		}
		
		System.out.println("Are employee 1 and employee 4 equal ?");
		System.out.println(employees[1].equals(employees[4]));
		Services service = new Services();
		service.sortEmployee(employees);
		service.searchEployee(employees, "Developer");
	}
}
