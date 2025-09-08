package com.sm.insert;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sm.JDBCSpring1st.Emp;

public class EmpDao implements EmpDaoInterface{
	JdbcTemplate jdbcTemplate;
	public int insert(Emp emp) {
		 String query="insert into emp(id,name) values(?,?)";
		 int count=jdbcTemplate.update(query, emp.getId(),emp.getName());
		return count;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
