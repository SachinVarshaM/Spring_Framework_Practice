package com.sm.JDBCSpring6th;

public interface StudentDao {
public int insert(Student std);
public int change(Student std);
public int delete(int stdID);
public Student getStudent(int stdID);
}
