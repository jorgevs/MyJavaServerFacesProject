package com.jvs.jsf.beans.sample.validations;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import com.jvs.jsf.utils.FacesContextHelper;

@ManagedBean(name = "vacancyForm")
@RequestScoped
public class VacancyForm {

	@ManagedProperty(value = "#{employee}")
	private Employee emp;

	private boolean sentComment = false;

	public String send() {
		System.out.println("name:" + emp.getName());
		System.out.println("lastName:" + emp.getLastName());
		System.out.println("desidedSalary:" + emp.getDesiredSalary());
		System.out.println("birthDate:" + emp.getBirthDate());

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

	public void zipListener(ValueChangeEvent event) {
		System.out.println("Executing zipListener() method...");

		FacesContext facesContext = FacesContext.getCurrentInstance();
		UIViewRoot uiViewRoot = facesContext.getViewRoot();
		String newZip = (String) event.getNewValue();

		if ("50170".equals(newZip)) {
			UIInput cityInputText = (UIInput) uiViewRoot.findComponent("vacancyForm:city");
			String city = "Toluca";
			cityInputText.setValue(city);
			cityInputText.setSubmittedValue(city);

			UIInput colonyInputText = (UIInput) uiViewRoot.findComponent("vacancyForm:colony");
			String colony = "Las Haciendas";
			colonyInputText.setValue(colony);
			colonyInputText.setSubmittedValue(colony);

			// Goes directly to the 6th JSF Phase
			facesContext.renderResponse();
		}

	}

	public void hideComments(ActionEvent event) {
		this.sentComment = !this.sentComment;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public boolean isSentComment() {
		return sentComment;
	}

	public void setSentComment(boolean sentComment) {
		this.sentComment = sentComment;
		FacesContext facesContext = FacesContext.getCurrentInstance();
	    FacesContextHelper.cleanImmediateFacesMessages(facesContext);
	}

}
