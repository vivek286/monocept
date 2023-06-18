package com.monocept.customer;

public class customer {
private int salary;
private int eid;
private String name;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public customer(int salary, int eid, String name) {
	super();
	this.salary = salary;
	this.eid = eid;
	this.name = name;
}
@Override
public String toString() {
	return "customer [salary=" + salary + ", eid=" + eid + ", name=" + name + "]";
}


}
