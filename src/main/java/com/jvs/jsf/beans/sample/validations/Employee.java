package com.jvs.jsf.beans.sample.validations;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "employee")
@RequestScoped
public class Employee implements Serializable {

	private String name = "Insert your name";
	private String lastName = "Insert your last name";
	private String desiredSalary = "Insert your desired salary";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesiredSalary() {
		return desiredSalary;
	}

	public void setDesiredSalary(String desiredSalary) {
		this.desiredSalary = desiredSalary;
	}
}
