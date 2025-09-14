package com.sm.JDBCSpring2nd;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao implements EmpDaoInterface {
	JdbcTemplate jdbcTemplate;

	public int insert(Emp emp) {
		 
		String query="insert into emp(id,name) values(?,?)";
		int count =jdbcTemplate.update(query,emp.getId(),emp.getName());
		return count;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	

}
