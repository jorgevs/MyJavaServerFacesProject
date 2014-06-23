package com.jvs.jsf.beans.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "beanRequestScope")
@RequestScoped
public class BeanRequestScope implements Serializable {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
