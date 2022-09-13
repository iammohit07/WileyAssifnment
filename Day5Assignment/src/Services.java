public class Services {
	public void sortEmployee(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].getEmpBasicSalary() > e[j].getEmpBasicSalary()) {
					Employee y = e[i];
					e[i] = e[j];
					e[j] = y;
				}
			}
		}
		for (Employee i : e) {
			
			System.out.println(
					"Emplyee Id : " + i.getEmpId() + 
					" Name : " + i.getEmpName() + 
					" Department : " + i.getEmpDept() + 
					" GrossSalary " + i.getEmpGrossSalary());
		}
		System.out.println();
	}

	public void searchEployee(Employee e[], String dept) {
		System.out.println("Employees with Department " + dept + " are:");
		for (Employee i : e) {
			if (i.getEmpDept() == dept) {
				System.out.println(
						"Emplyee Id : " + i.getEmpId() + 
						" Name : " + i.getEmpName() + 
						" Department : " + i.getEmpDept() + 
						" GrossSalary " + i.getEmpGrossSalary());
			}
		}
	}
}