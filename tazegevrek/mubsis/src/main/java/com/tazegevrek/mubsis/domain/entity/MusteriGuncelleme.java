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
@Table(name = "MUSTERI_GUNCELLE")
@SuppressWarnings("serial")
public class MusteriGuncelleme extends PersistentObject {

	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Islem islem;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Musteri musteri;
	
	@Column(name = "AD")
	private String ad;
	
	@Column(name = "SOYAD")
	private String soyad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MUSTERI_DURUM_ID")
	@Fetch(FetchMode.SELECT)
	private Referans musteriDurumu;
	
	@Column(name = "TELEFON")
	private String telefon;
	
	@Column(name = "GSM_NO")
	private String gsmNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADRES")
	private String adres;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Il dogumYeri;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DOGUM_TARIHI", nullable = false)
	private Date dogumTarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CINSIYETI")
	@Fetch(FetchMode.SELECT)
	private Referans cinsiyeti;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MEDENI_HALI")
	@Fetch(FetchMode.SELECT)
	private Referans medeniHali;
	
	@Column(name = "TC_KIMLIK_NO")
	private String tcKimlikNo;

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
	
	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
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

	public Referans getMusteriDurumu() {
		return musteriDurumu;
	}

	public void setMusteriDurumu(Referans musteriDurumu) {
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

	public Referans getCinsiyeti() {
		return cinsiyeti;
	}

	public void setCinsiyeti(Referans cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}

	public Referans getMedeniHali() {
		return medeniHali;
	}

	public void setMedeniHali(Referans medeniHali) {
		this.medeniHali = medeniHali;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

}
