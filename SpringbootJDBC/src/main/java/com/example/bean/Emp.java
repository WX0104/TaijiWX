package com.example.bean;

import java.sql.Date;

public class Emp {

	private String ename;
	private Date hiredate;
	private double sal;
	private int deptno;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
}
