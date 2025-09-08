package com.sm.JDBCSpring6th;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoClass implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student std) {
		String query = "insert into student(roll,name) values(?,?)";

		int count = jdbcTemplate.update(query, std.getRoll(), std.getName());
		return count;
	}

	public int change(Student std) {
		String query = "update student set roll=?, name=? where roll=?";
		int count = jdbcTemplate.update(query, std.getRoll(),std.getName(), std.getRoll());
		return count;

	}

	public int delete(int stdID) {
		 String query="delete from student where roll=?";
		 
		 int count=jdbcTemplate.update(query,stdID);
		return count;
	}

	public Student getStudent(int stdID) {
		String query = "select * from student where roll=?";
		RowMapper<Student> rowMapper = new RowMapperClass();
		Student std = this.jdbcTemplate.queryForObject(query, rowMapper, stdID);
		return std;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
