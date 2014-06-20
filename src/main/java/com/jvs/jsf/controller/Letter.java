package com.jvs.jsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "letter", eager = true)
@SessionScoped
public class Letter {

	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message = "External message!";

	public Letter() {
		System.out.println("Initialize Letter");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}

}
