package com.monocept.classes;

public class employe {
	private String name;
	private int eid;
	private int salary;
	public employe(String name, int eid, int salary) {
		
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
