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
@Table(name = "MUSTERI")
@SuppressWarnings("serial")
public class Musteri extends PersistentObject {

	@Column(name = "AD")
	private String ad;
	
	@Column(name = "SOYAD")
	private String soyad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
	
	@Column(name = "MUSTERI_DURUMU")
	private String musteriDurumu;
	
	@Column(name = "TELEFON")
	private String telefon;
	
	@Column(name = "GSM_NO")
	private String gsmNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADRES")
	private String adres;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DOGUM_YERI_ID")
	@Fetch(FetchMode.SELECT)
	private Il dogumYeri;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DOGUM_TARIHI", nullable = false)
	private Date dogumTarihi;
	
	@Column(name = "CINSIYET")
	private String cinsiyeti;
	
	@Column(name = "MEDENI_HALI")
	private String medeniHali;
	
	@Column(name = "TC_KIMLIK_NO")
	private String tcKimlikNo;

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

	public String getMusteriDurumu() {
		return musteriDurumu;
	}

	public void setMusteriDurumu(String musteriDurumu) {
		this.musteriDurumu = musteriDurumu;
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

	public Il getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(Il dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getCinsiyeti() {
		return cinsiyeti;
	}

	public void setCinsiyeti(String cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}

	public String getMedeniHali() {
		return medeniHali;
	}

	public void setMedeniHali(String medeniHali) {
		this.medeniHali = medeniHali;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
		
}
