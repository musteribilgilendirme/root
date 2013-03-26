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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SABLON_TIPI_ID")
	@Fetch(FetchMode.SELECT)
	private Referans sablonTipi;
		
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DURUM_ID")
	@Fetch(FetchMode.SELECT)
	private Referans durum;

	public Referans getSablonTipi() {
		return sablonTipi;
	}

	public void setSablonTipi(Referans sablonTipi) {
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

	public Referans getDurum() {
		return durum;
	}

	public void setDurum(Referans durum) {
		this.durum = durum;
	}

	
}
