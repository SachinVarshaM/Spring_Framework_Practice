package com.sm.JDBCSpring5th;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfiguration {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new  DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sachin");
		ds.setUsername("root");
		ds.setPassword("admin");
		
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	@Bean("empDao")
	public EmpDaoImpl getEmpDao()
	
	{
		EmpDaoImpl emp=new EmpDaoImpl();
		  emp.setJdbcTemplate(getTemplate());
		  
		 return emp;
	}
}
