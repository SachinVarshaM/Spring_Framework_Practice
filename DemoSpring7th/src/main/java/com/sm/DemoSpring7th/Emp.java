package com.sm.DemoSpring7th;

public class Emp {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		 System.out.println( "Assigning Value" );
		this.price = price;
	}
	

	@Override
	public String toString() {
		System.out.println("Reading block");
		return "price=" + price + "";
	}
	
	public void init()
	{
	 System.out.println("Initialize block");	
	}
	public void destroy()
	{
	 System.out.println("Clean-up block");	
	}
	
	
	

}
