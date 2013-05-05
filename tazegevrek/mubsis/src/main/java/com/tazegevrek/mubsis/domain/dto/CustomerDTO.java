package com.tazegevrek.mubsis.domain.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerDTO implements Serializable {

	private String name;
	private String surname;
	private String homeNumber;
	private String gsmNo;
	private String email;
	private String adress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getGsmNo() {
		return gsmNo;
	}

	public void setGsmNo(String gsmNo) {
		this.gsmNo = gsmNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
