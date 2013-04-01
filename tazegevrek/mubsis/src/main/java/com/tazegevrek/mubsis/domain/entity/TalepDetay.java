package com.tazegevrek.mubsis.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Type;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "TALEP_DETAY")
@SuppressWarnings("serial")
public class TalepDetay extends PersistentObject {

	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TALEP_ID")
	@Fetch(FetchMode.SELECT)
	private Talep talep;

	@Column(name = "BILDIRIM_TIPI")
	private String bildirimTipi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MUSTERI_ID")
	@Fetch(FetchMode.SELECT)
	private Musteri musteri;
	
	@Column(name = "DEGERI",nullable=false)
	private String degeri;
	
	@Lob
	@Type(type = "java.lang.String")
	@Column(name = "ICERIK")
	private String icerik;
	
	@Lob
	@Type(type = "java.lang.String")
	@Column(name = "E")
	private String ek;
	

	@Column(name = "BILDIRIM_DURUMU_ID")
	private String bildirimDurumu;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;

	public Date getIslemTarihi() {
		return islemTarihi;
	}

	public void setIslemTarihi(Date islemTarihi) {
		this.islemTarihi = islemTarihi;
	}

	public Talep getTalep() {
		return talep;
	}

	public void setTalep(Talep talep) {
		this.talep = talep;
	}

	public String getBildirimTipi() {
		return bildirimTipi;
	}

	public void setBildirimTipi(String bildirimTipi) {
		this.bildirimTipi = bildirimTipi;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public String getDegeri() {
		return degeri;
	}

	public void setDegeri(String degeri) {
		this.degeri = degeri;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getEk() {
		return ek;
	}

	public void setEk(String ek) {
		this.ek = ek;
	}

	public String getBildirimDurumu() {
		return bildirimDurumu;
	}

	public void setBildirimDurumu(String bildirimDurumu) {
		this.bildirimDurumu = bildirimDurumu;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}
	
}
