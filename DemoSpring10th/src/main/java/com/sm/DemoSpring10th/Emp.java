package com.sm.DemoSpring10th;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println( "Setter");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println( "Constructor");
	}
	
	

}
