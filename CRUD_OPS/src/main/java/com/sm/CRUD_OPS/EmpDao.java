package com.sm.CRUD_OPS;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmpDao {
	private HibernateTemplate hibernateTemplate;
	public void insert(Emp emp)
	{
		hibernateTemplate.save(emp);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
