package com.sm.JDBCSpring8th;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDetaSource()
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
		jdbcTemplate.setDataSource(getDetaSource());
		return jdbcTemplate;
	}
	
	@Bean("empDao")
	public EmpDao getStudentDao()
	{
		EmpDao emp=new EmpDao();
		emp.setJdbcTemplate(getJdbcTemplate());
		return emp;
		
	}

}
