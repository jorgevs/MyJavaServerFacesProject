package com.jvs.beans.sample.subcriberuser;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "subscribeUser")
@RequestScoped
public class SubscribeUser implements Serializable {
	private static final Logger log = LoggerFactory.getLogger(SubscribeUser.class);

	private String message;
	private boolean subscribed = false;

	@ManagedProperty(value = "#{subscribeService}")
	SubscribeService subscribeService;

	public boolean isSubscribed() {
		this.subscribed = subscribeService.getStatus();	
		System.out.println("isSubscribed():" + this.subscribed);
		return this.subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;		
		System.out.println("setSubscribed():" + this.subscribed);
	}

	
	
	
	public String subscribeAction() {
		System.out.println("subscribeAction()...");
		subscribeService.subscribeUser();
		return null;
	}

	public String unsubscribeAction() {
		System.out.println("unsubscribeAction()...");
		subscribeService.unsubscribeUser();
		return null;
	}
	
	public String getMessage() {
		System.out.println("message=" + message);
		return message;
	}

	public void setSubscribeService(SubscribeService subscribeService) {
		this.subscribeService = subscribeService;
	}

	public SubscribeService getSubscribeService() {
		return subscribeService;
	}


}
