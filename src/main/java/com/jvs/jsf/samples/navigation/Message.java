package com.jvs.jsf.samples.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "message", eager = true)
@SessionScoped
public class Message {

	private String message = "Internal message!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
