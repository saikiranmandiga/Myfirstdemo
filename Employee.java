package comm;

public class Employee {
	private int empID;
	private String empName;
	private String empAddress;
	public int getEmpID() {
		return empID;
	}
	@Override
	public String toString() {
		
		return empID +empAddress +empName;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
}
