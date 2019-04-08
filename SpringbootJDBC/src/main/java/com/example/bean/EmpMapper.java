package com.example.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		 Emp emp = new Emp();
		 emp.setEname(rs.getString("ename"));
        
         return emp;
		
	}



}
