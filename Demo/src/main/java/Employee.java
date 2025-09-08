
import java.io.Serializable;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="EmplyoeeService",namespace="http://bemach.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder= {"EmpId","Emp_Name","Emp_Add","Emp_Salary","Emp_Company"})
public class Employee implements Serializable {
	
	private static final long SerialVersionUID=1L;
	@XmlElement(name="EmpId", required=true)
	private String EmpId;
	@XmlElement(name="Emp_Name", required=true)
	private String Emp_Name;
	@XmlElement(name="Emp_Add", required=true)
	private String Emp_Add;
	@XmlElement(name="Emp_Salary", required=true)
	private String Emp_Salary;
	@XmlElement(name="Emp_Company", required=true)
	private String Emp_Company;
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getEmp_Add() {
		return Emp_Add;
	}
	public void setEmp_Add(String emp_Add) {
		Emp_Add = emp_Add;
	}
	public String getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(String emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	public String getEmp_Company() {
		return Emp_Company;
	}
	public void setEmp_Company(String emp_Company) {
		Emp_Company = emp_Company;
	}
	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Emp_Name=" + Emp_Name + ", Emp_Add=" + Emp_Add + ", Emp_Salary="
				+ Emp_Salary + ", Emp_Company=" + Emp_Company + "]";
	}
	 

}
