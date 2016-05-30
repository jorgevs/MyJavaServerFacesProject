package com.jvs.jsf.beans.sample.validationform;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "validationForm")
@RequestScoped
public class ValidationForm {

	private String name;
	private String lastName;
	private Integer age;
	private String phoneNumber;
	private String address;
	private String email;
	private String password;
	private Date birthDate = new Date();
	private String comments;
	private String hidden = "day";
	private boolean adult;
	private int[] selectedPeople;
	private int selectedGender;
	private int selectedMonth;
	private int[] selectedSports;
	private int selectedMenu;
	private int[] selectedMenus;

	@PostConstruct
	public void initialize(){
		System.out.println("Initialize method...");
	}
	
	@PreDestroy
	public void finalize(){
		System.out.println("Finalize method...");
	}
	
	public void validateAddress(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String address = (String)value;
		if(address.length() < 5){
			FacesMessage message = new FacesMessage("Enter a string larger than 5 letters");
			throw new ValidatorException(message);
		}
	}
	
	public String send() {
		System.out.println("Selected people:");
		for (int person : selectedPeople) {
			System.out.println(person);
		}
		System.out.println("Selected sports:");
		for (int sport : selectedSports) {
			System.out.println(sport);
		}
		System.out.println("Selected menus:");
		for (int menu : selectedMenus) {
			System.out.println(menu);
		}		
		return "/pages/ValidationFormSample/success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public int[] getSelectedPeople() {
		return selectedPeople;
	}

	public void setSelectedPeople(int[] selectedPeople) {
		this.selectedPeople = selectedPeople;
	}

	public int getSelectedGender() {
		return selectedGender;
	}

	public void setSelectedGender(int selectedGender) {
		this.selectedGender = selectedGender;
	}

	public int getSelectedMonth() {
		return selectedMonth;
	}

	public void setSelectedMonth(int selectedMonth) {
		this.selectedMonth = selectedMonth;
	}

	public int[] getSelectedSports() {
		return selectedSports;
	}

	public void setSelectedSports(int[] selectedSports) {
		this.selectedSports = selectedSports;
	}

	public int getSelectedMenu() {
		return selectedMenu;
	}

	public void setSelectedMenu(int selectedMenu) {
		this.selectedMenu = selectedMenu;
	}

	public int[] getSelectedMenus() {
		return selectedMenus;
	}

	public void setSelectedMenus(int[] selectedMenus) {
		this.selectedMenus = selectedMenus;
	}

}
