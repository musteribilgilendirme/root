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
@Table(name = "MUSTERI_ETIKETI_DEGER")
@SuppressWarnings("serial")
public class MusteriEtiketDegeri extends PersistentObject {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MUSTERI_ETIKETI_ID")
	@Fetch(FetchMode.SELECT)
	private MusteriEtiket etiket;
	
	@Column(name = "DEGER")
	private String deger;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "KOD")
	@Fetch(FetchMode.SELECT)
	private Referans durum;

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public MusteriEtiket getEtiket() {
		return etiket;
	}

	public void setEtiket(MusteriEtiket etiket) {
		this.etiket = etiket;
	}

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public Referans getDurum() {
		return durum;
	}

	public void setDurum(Referans durum) {
		this.durum = durum;
	}
	
	}
