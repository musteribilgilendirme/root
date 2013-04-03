package com.tazegevrek.mubsis.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@SuppressWarnings("serial")
public class NewUserDTO implements Serializable{

	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Size(min=8, max=25)
	private String password;

	@NotEmpty
	@Size(min=8, max=25)
	private String repassword;
	
	@NotNull
	private Long gsmNo;
	
	@NotEmpty
	@Size(min=2, max=25)
	private String name;
	
	@NotEmpty
	@Size(min=2, max=25)
	private String surname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Long getGsmNo() {
		return gsmNo;
	}

	public void setGsmNo(Long gsmNo) {
		this.gsmNo = gsmNo;
	}

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
		
}
