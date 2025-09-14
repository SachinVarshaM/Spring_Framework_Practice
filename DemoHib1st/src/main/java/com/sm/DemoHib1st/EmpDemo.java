package com.sm.DemoHib1st;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_DATA")
public class EmpDemo {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastlName;
	private String email;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastlName() {
		return lastlName;
	}
	public void setLastlName(String lastlName) {
		this.lastlName = lastlName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmpDemo [id=" + id + ", firstName=" + firstName + ", lastlName=" + lastlName + ", email=" + email
				+ ", age=" + age + "]";
	}
	 
	

}
