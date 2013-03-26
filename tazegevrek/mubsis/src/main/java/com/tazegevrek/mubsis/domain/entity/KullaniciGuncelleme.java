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
@Table(name = "KULLANICI_GUNCELLE")
@SuppressWarnings("serial")
public class KullaniciGuncelleme extends PersistentObject {

	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ISLEM_ID")
	@Fetch(FetchMode.SELECT)
	private Islem islem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KULLANICI_ID")
	@Fetch(FetchMode.SELECT)
	private Kullanici kullanici;
	
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DURUM_ID")
	@Fetch(FetchMode.SELECT)
	private Referans durum;

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
	
	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
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

	public Referans getDurum() {
		return durum;
	}

	public void setDurum(Referans durum) {
		this.durum = durum;
	}
	
	
}
