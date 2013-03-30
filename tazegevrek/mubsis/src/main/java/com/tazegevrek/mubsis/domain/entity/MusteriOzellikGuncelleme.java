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
@Table(name = "MUSTERI_OZELLIK_GUNCELLE")
@SuppressWarnings("serial")
public class MusteriOzellikGuncelleme extends PersistentObject {
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ISLEM_ID")
	@Fetch(FetchMode.SELECT)
	private Islem islem;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MUSTERI_OZELLIK_ID")
	@Fetch(FetchMode.SELECT)
	private MusteriOzellik musteriOzellik;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MUSTERI_ID")
	@Fetch(FetchMode.SELECT)
	private Musteri musteri;
	
	@Column(name = "ANAHTAR",nullable=false)
	private String anahtar;
	
	@Column(name = "DEGER",nullable=false)
	private String deger;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;	
	
	@Column(name = "DURUM_ID")
	private String durum;

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
	
	public MusteriOzellik getMusteriOzellik() {
		return musteriOzellik;
	}

	public void setMusteriOzellik(MusteriOzellik musteriOzellik) {
		this.musteriOzellik = musteriOzellik;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public String getAnahtar() {
		return anahtar;
	}

	public void setAnahtar(String anahtar) {
		this.anahtar = anahtar;
	}

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}


	
}
