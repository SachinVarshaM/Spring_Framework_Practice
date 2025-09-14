package com.sm.JDBCSpring9th;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate jdbcTemplate;

	public Emp getEmp(int id) {
		String query = "select * from emp where id=?";

		RowMapper<Emp> rowMapper = new RowMapperClass();
		
		Emp emp=jdbcTemplate.queryForObject(query,rowMapper,id);

		return emp;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
