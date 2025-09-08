package com.sm.JDBCSpring6th;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sachin");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() 
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	@Bean("stdDao")
	public StudentDaoClass getStudentDao()
	{
		StudentDaoClass std=new StudentDaoClass();
		std.setJdbcTemplate(getJdbcTemplate());
		
		return std;
	}
}
