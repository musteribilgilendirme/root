package com.tazegevrek.mubsis.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "SIRKET_GUNCELLE")
@SuppressWarnings("serial")
public class SirketGuncelleme extends PersistentObject {

	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ISLEM_ID")
	@Fetch(FetchMode.SELECT)
	private Islem islem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
	
	@Column(name = "UNVANI", nullable = false)
	private String unvani;
	
	@Column(name = "SIRKET_TURU")
	private String sirketTuru;
	
	@Column(name = "AVANS", nullable = false)
	private Long avans;
	
	@Column(name = "TELEFON")
	private String telefon;
	
	@Column(name = "GSM_NO")
	private String gsmNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADRES")
	private String adres;

	public Date getIslemTarihi() {
		return islemTarihi;
	}

	public void setIslemTarihi(Date islemTarihi) {
		this.islemTarihi = islemTarihi;
	}

	public Islem getIslem() {
		return islem;
	}

	public void setIslem(Islem islem) {
		this.islem = islem;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public String getUnvani() {
		return unvani;
	}

	public void setUnvani(String unvani) {
		this.unvani = unvani;
	}

	public String getSirketTuru() {
		return sirketTuru;
	}

	public void setSirketTuru(String sirketTuru) {
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
