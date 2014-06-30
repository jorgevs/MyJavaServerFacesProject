package com.jvs.jsf.beans.sample.checkpassword;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "beanCheckPassword")
@RequestScoped
public class BeanCheckPassword {

	private String password;
	private String pwdResult = "xx";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwdResult() {
		if (getPassword() != null && !getPassword().isEmpty()) {
			if (getPassword().length() < 3) {
				pwdResult = "Poor";
			} else if (getPassword().length() < 5) {
				pwdResult = "Good";
			} else if (getPassword().length() < 7) {
				pwdResult = "Super";
			} else if (getPassword().length() >= 7) {
				pwdResult = "Excellent";
			}
		} else {
			pwdResult = "";
		}

		return pwdResult;
	}

	public void setPwdResult(String pwdResult) {
		this.pwdResult = pwdResult;
	}
}
