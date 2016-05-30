package com.jvs.jsf.beans.sample.checkpassword;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "beanCheckPassword")
@RequestScoped
public class BeanCheckPassword implements Serializable {

	private String password;
	private String pwdResult;
	private double number;
	private double range = 1.0;

	public BeanCheckPassword() {
		System.out.println("...constructor::BeanCheckPassword()");
	}
	
	public String getPassword() {
		System.out.println("...getPassword(): " + password);
		return password;
	}

	public void setPassword(String password) {
		System.out.println("...setPassword(String password): " + password);
		this.password = password;
	}

	public String getPwdResult() {		

		if (this.password != null && !this.password.isEmpty()) {
			if (this.password.length() < 3) {
				pwdResult = "Poor";
			} else if (this.password.length() < 5) {
				pwdResult = "Good";
			} else if (this.password.length() < 7) {
				pwdResult = "Super";
			} else if (this.password.length() >= 7) {
				pwdResult = "Excellent";
			}
		} else {
			pwdResult = "xx";
		}
		
		System.out.println("...getPwdResult(): " + pwdResult);
		return pwdResult;
	}

	public void setPwdResult(String pwdResult) {
		System.out.println("...setPwdResult(String pwdResult): " + pwdResult);
		this.pwdResult = pwdResult;
	}

	public double getNumber() {
		System.out.println("...getNumber(): " + number);
		return number;
	}

	public void setNumber(double number) {
		System.out.println("...setNumber(double number): " + number);
		this.number = number;
	}
	
	public String randomize(){
		System.out.println("...randomize(): " + number + " " + range);
		number = range * Math.random();
		return null;
	}

	public double getRange() {
		System.out.println("...getRange(): " + range);
		return range;
	}

	public void setRange(double range) {
		System.out.println("...setRange(double range): " + range);
		this.range = range;
	}
	
	
}
