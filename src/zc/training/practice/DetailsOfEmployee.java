package zc.training.practice;

public class DetailsOfEmployee {
	String employeeName;
	String employeeId;
	long employeePhno;
	int employeeAge;
	double employeeSalary;

	public void setDetails(String employeeName, String employeeId, long employeePhno, int employeeAge,
			double employeeSalary) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeePhno = employeePhno;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public long getEmployeePhno() {
		return employeePhno;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}
}
