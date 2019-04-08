package com.example;





import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.example.bean.Emp;
import com.example.bean.EmpMapper;



@SpringBootApplication
public class SpringbootJdbcApplication {
     
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@PostConstruct
	public void Demo() {
		/////////////////////
	int rowCount = this.jdbcTemplate.queryForObject("select count(*) from emp", Integer.class);
	System.out.println("******************");
	System.out.println(rowCount);
	/////////////////////
	int countOfActorsNamed = this.jdbcTemplate.queryForObject(
	        "select count(*) from emp where ename = ? ", Integer.class,"kk");
	System.out.println("******************");
	System.out.println(countOfActorsNamed);
	///////////////////////
	String Name = this.jdbcTemplate.queryForObject(
	        "select ename from emp where deptno = ? and sal= ?",
	        new Object[]{1,1.00}, String.class);
	System.out.println("******************");
	System.out.println(Name);
	///////////////////
	Emp emp = this.jdbcTemplate.queryForObject(
	        "select ename from emp where deptno = ?",
	        new Object[]{1},
	        new RowMapper<Emp>() {
	            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
	                Emp emp = new Emp();
	                emp.setEname(rs.getString("ename"));
	                System.out.println("******************");
	                System.out.println(emp.getEname());
	                return emp;
	            }
	        });
	///////////
	List<Emp> emplist=this.jdbcTemplate.query( "select ename from emp", new EmpMapper());
	System.out.println("******************");
	System.out.println(emplist.toString());
	
	
	}
	
	
	
		
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootJdbcApplication.class, args);
		
		
		
	}

}
