package com.jvs.jsf.beans.sample.scopes;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "beanApplicationScope")
@ApplicationScoped
public class BeanApplicationScope implements Serializable {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
