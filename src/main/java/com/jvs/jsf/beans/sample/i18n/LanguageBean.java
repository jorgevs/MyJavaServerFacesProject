package com.jvs.jsf.beans.sample.i18n;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "languageBean")
@SessionScoped
public class LanguageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String localeCode = ((Locale)Locale.getDefault()).getLanguage();
	private static Map<String, Object> countries;

	static public final Locale SPANISH = new Locale("es");
	static public final Locale ENGLISH = new Locale("en");
	
	static {
		countries = new LinkedHashMap<String, Object>();
		countries.put("English", ENGLISH); // label, value
		countries.put("Spanish", SPANISH);
	}

	public Map<String, Object> getCountriesInMap() {
		return countries;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	// value change event listener
	public void countryLocaleCodeChanged(ValueChangeEvent e) {
		String newLocaleValue = e.getNewValue().toString();
		System.out.println("newLocaleValue: " + newLocaleValue);

		//FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(newLocaleValue));
	}
}
