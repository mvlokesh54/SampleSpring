package com.javatpoint.dao;

import java.util.jar.Attributes.Name;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javatpoint.Emp;

public class EmpDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template=template;
	}
	
	public int save(Emp p)
	{
		String sql="insert into Emp99 values("+1+","+p.getName()+","+p.getSalary()+","+p.getDesignation()+")";
		return template.update(sql);
	}
	
	
	
	
}
