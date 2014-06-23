package com.jvs.jsf.beans.scope;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "beanViewScope")
@ViewScoped
public class BeanViewScope implements Serializable {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
