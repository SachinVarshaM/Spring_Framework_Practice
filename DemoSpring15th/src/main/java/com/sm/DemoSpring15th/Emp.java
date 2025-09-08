package com.sm.DemoSpring15th;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	@Value("#{10+10}") //Operator Expression
	private int a;
	@Value("#{T(java.lang.Math).E}") //Static variable
	private int b;
	@Value("#{new String('Sachin Mane')}") //Object Creation
	private String c;
	@Value("#{T(java.lang.Math).sqrt(144)}") //Method Call
	private int d;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Emp [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
