package com.sm.DemoSpring6th;

public class Val {
	private int a;
	private int b;
	public Val(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Integer Constructor");
		 
	}
	
	public Val(long a, long b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Long Constructor");
		 
	}
	
	public void doSum()
	{
		
		System.out.println("Addition :"+(a+b));
		
	}

}
