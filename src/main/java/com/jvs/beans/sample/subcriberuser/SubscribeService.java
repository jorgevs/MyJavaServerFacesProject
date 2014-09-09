package com.jvs.beans.sample.subcriberuser;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "subscribeService")
@SessionScoped
public class SubscribeService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5258260721234658673L;

	public void unsubscribeUser() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("subscribed", Boolean.TRUE);
	}	
	
	public void subscribeUser() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();
		sessionMap.put("subscribed", Boolean.FALSE);
	}

	public boolean getStatus() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();

		Boolean variable = (Boolean) sessionMap.get("subscribed");
		if (variable != null) {
			if (variable == Boolean.TRUE) {
				return true;
			}
		}
		return false;
	}
}
