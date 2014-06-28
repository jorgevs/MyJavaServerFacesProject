package com.jvs.jsf.beans.sample.validations;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "employee")
@RequestScoped
public class Employee implements Serializable {

	private String name = "Insert your name";
	private String lastName = "Insert your last name";
	private int desiredSalary = 1500;
	private Date birthDate;

	private String city = "";
	private long colonyId = 0;
	private String zip = "";
	private String comments = "Insert here your comments...";

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

	public int getDesiredSalary() {
		return desiredSalary;
	}

	public void setDesiredSalary(int desiredSalary) {
		this.desiredSalary = desiredSalary;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getColonyId() {
		return colonyId;
	}

	public void setColonyId(long colonyId) {
		this.colonyId = colonyId;
	}
}
