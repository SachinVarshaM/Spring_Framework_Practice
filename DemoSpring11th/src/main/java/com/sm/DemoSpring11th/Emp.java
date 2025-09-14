package com.sm.DemoSpring11th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("addr1") //for multiple bean
	 private Address address;

	public Address getAddress() {
		return address;
	}
//	@Autowired
//	@Qualifier("addr1") //for multiple bean
	public void setAddress(Address address) {
		System.out.println("Setter");
		this.address = address;
	}
	//@Autowired
	
	public Emp(Address address) {
		
		super();
		System.out.println("Constructor");
		this.address = address;
	}

	 

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
