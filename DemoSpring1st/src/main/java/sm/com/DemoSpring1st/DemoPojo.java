package sm.com.DemoSpring1st;

public class DemoPojo {
	private int empId;
	private String empName;
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public DemoPojo(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public DemoPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DemoPojo [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	

}
