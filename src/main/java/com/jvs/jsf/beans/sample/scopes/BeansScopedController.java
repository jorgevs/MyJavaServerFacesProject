package com.jvs.jsf.beans.sample.scopes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "beansScopedController")
@SessionScoped
public class BeansScopedController {

	/**
	 * 
	 * @param event
	 */
	public void changeValues(ActionEvent event) {
		//System.out.println("Stored values in each ModelBean\n");
	}

	/**
	 * 
	 * @return
	 */
	public String changePage() {
		System.out.println("Change of page...");
		return "showValuesPage";// showValuesPage.xhtml
	}
	
}
