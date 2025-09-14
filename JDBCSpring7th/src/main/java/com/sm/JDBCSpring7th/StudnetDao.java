package com.sm.JDBCSpring7th;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudnetDao {
	JdbcTemplate jdbcTemplate;
	public Student getStudent(int roll)
	{
		String query="select * from student where roll=?";
		RowMapper<Student> rowMapper=new RowMapperClass();
		Student std=jdbcTemplate.queryForObject(query,rowMapper,roll);
		return std;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
