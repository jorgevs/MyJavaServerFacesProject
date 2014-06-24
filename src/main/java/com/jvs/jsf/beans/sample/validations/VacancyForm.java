package com.jvs.jsf.beans.sample.validations;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "vacancyForm")
@RequestScoped
public class VacancyForm {

	@ManagedProperty(value = "#{employee}")
	private Employee emp;

	public String send() {
		System.out.println("name:" + emp.getName());
		System.out.println("lastName:" + emp.getLastName());
		System.out.println("desidedSalary:" + emp.getDesiredSalary());

		if (emp.getName().equals("John")) {

			if (emp.getLastName().equals("Doe")) {
				String msg = "Thanks, but Jhon Doe already joined us.";
				FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String clientId = null;
				facesContext.addMessage(clientId, facesMessage);
				return "validationsPage";
			}
			
			return "success";// success.xhtml
		} else {
			return "fail";// fail.xhtml
		}
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
