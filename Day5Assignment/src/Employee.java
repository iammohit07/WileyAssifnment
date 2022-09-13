public class Employee {
	private int empId;
	private double empGrossSalary, empBasicSalary;
	private String empName, empDept;

	public Employee() {

	}

	public Employee(int empid, String empName, String empDept, double empBasicSalary) {
		this.empId = empid;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public void calculateGrossSalary() {
		empGrossSalary = empBasicSalary * 1.2;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if ((e.getEmpId() == this.empId) && (e.getEmpName() == this.empName)) {
			return true;
		}
		return false;
	}
}