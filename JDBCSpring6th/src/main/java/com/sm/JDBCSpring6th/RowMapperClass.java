package com.sm.JDBCSpring6th;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperClass implements RowMapper<Student>
{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Student std=new Student();
		 std.setRoll(rs.getInt(1));
		 std.setName(rs.getString(2));
		return std;
	}

}
