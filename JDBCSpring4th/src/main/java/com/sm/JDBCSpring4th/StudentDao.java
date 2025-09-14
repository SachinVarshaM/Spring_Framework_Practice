package com.sm.JDBCSpring4th;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao implements StudentDaoInterface {
	
	private JdbcTemplate jdbcTemplate;

	public int change(Student std) {
		 String query="insert into student values(?,?)";
		 
		 int count=jdbcTemplate.update(query, std.getRoll(),std.getName());
		 
		return count;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int remove(Student std) {
		 int cnt=0;
		 String query="delete from student where roll=?";
		 cnt=jdbcTemplate.update(query,std.getRoll());
		return cnt;
	}
	
	
	

}
