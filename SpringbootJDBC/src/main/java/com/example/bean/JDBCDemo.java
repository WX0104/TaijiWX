package com.example.bean;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JDBCDemo {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		 this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		}
	@GetMapping("/select")
		public void countOfActorsByFirstName(String ename) {
		 String sql = "select count(*) from emp where ename = :ename";
		 SqlParameterSource namedParameters = new MapSqlParameterSource("ename", ename);
		 System.out.println(this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class));
		
		}
	
}
