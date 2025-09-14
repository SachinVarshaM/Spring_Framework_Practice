package com.sm.JDBCSpring7th;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
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
	public StudnetDao getStudentDao()
	{
		StudnetDao stdDao=new StudnetDao();
		stdDao.setJdbcTemplate(getJdbcTemplate());
		return stdDao;
	}

}
