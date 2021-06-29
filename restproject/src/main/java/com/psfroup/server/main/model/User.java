package com.psfroup.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty; 
//@ApiModel(description ="detail of user data")
@Entity
@Table
public class User {
@Id
@GeneratedValue
private Integer id;
@Size(min=5,message="Name should have at least 5 characters")
//@ApiModelProperty(notes="name should have atleast 5 characters")
private String name;


public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + "]";
}

}
