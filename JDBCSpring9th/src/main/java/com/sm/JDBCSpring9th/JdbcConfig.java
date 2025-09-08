package com.sm.JDBCSpring9th;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource1()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sachin");
		ds.setUsername("root");
		ds.setPassword("admin");
		
		return ds;
		
	}
	
	@Bean("jdbcTemplate")
	
	public JdbcTemplate getJdbcTemplate1()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
		jdbcTemplate.setDataSource(getDataSource1());
		
		return jdbcTemplate;
	}
	@Bean("empDao")
	public EmpDao getEmpDao()
	{
		EmpDao emp=new EmpDao();
		
		emp.setJdbcTemplate(getJdbcTemplate1());
		
		return emp;
	}

}
