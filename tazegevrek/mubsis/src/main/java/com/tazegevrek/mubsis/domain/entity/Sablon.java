package com.tazegevrek.mubsis.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Type;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "SABLON")
@SuppressWarnings("serial")
public class Sablon extends PersistentObject {

	@Column(name = "SABLON_TIPI")
	private String sablonTipi;
		
	@Column(name = "ICERIK")
	private String icerik;
	
	@Lob
	@Type(type = "java.lang.String")
	@Column(name = "EK")
	private String ek;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
	
	@Column(name = "DURUM")
	private String durum;

	public String getSablonTipi() {
		return sablonTipi;
	}

	public void setSablonTipi(String sablonTipi) {
		this.sablonTipi = sablonTipi;
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
