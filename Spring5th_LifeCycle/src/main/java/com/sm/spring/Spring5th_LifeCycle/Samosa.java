package com.sm.spring.Spring5th_LifeCycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("In side Initalization");
	}
	
	public void destroy()
	{
		System.out.println("In side destroy");
	}

}
