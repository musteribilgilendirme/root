package com.tazegevrek.mubsis.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "SIRKET")
@SuppressWarnings("serial")
public class Sirket extends PersistentObject {

	@Column(name = "UNVANI", nullable = false)
	private String unvani;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "KOD")
	@Fetch(FetchMode.SELECT)
	private Referans sirketTuru;
	
	@Column(name = "UNVANI", nullable = false)
	private Long avans;
	
	@Column(name = "TELEFON")
	private String telefon;
	
	@Column(name = "GSM_NO")
	private String gsmNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADRES")
	private String adres;

	public String getUnvani() {
		return unvani;
	}

	public void setUnvani(String unvani) {
		this.unvani = unvani;
	}

	public Referans getSirketTuru() {
		return sirketTuru;
	}

	public void setSirketTuru(Referans sirketTuru) {
		this.sirketTuru = sirketTuru;
	}

	public Long getAvans() {
		return avans;
	}

	public void setAvans(Long avans) {
		this.avans = avans;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
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

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
}
