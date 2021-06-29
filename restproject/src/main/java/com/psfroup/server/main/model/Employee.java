package com.psfroup.server.main.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties({"name","number"})
@JsonFilter("someBeanFilter")
public class Employee {
	//@JsonIgnore
private Integer salary;
private Integer number;
private String name;
public Employee(Integer salary, Integer number, String name) {
	super();
	this.salary = salary;
	this.number = number;
	this.name = name;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
