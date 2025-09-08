package com.sm.DemoSpring12th;

import java.util.List;

public class DemoCollection {

	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "" + list + "";
	}
	
	
}
