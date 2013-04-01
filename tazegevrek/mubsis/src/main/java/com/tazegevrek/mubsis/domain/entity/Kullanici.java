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
@Table(name = "KULLANICI")
@SuppressWarnings("serial")
public class Kullanici extends PersistentObject {

	@Column(name = "KULLANICI_KODU", nullable = false,unique = true)
	private String kullaniciKodu;
	
	@Column(name = "SIFRE", nullable = false)
	private String sifre;
	
	@Column(name = "AD")
	private String ad;
	
	@Column(name = "SOYAD")
	private String soyad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
	
	@Column(name = "ROL")
	private String rol;
	
	@Column(name = "GSM_NO")
	private String gsmNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "DURUM")
	private String durum;

	public String getKullaniciKodu() {
		return kullaniciKodu;
	}

	public void setKullaniciKodu(String kullaniciKodu) {
		this.kullaniciKodu = kullaniciKodu;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	
	
}
