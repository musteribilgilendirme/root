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
@Table(name = "MUSTERI_ETIKET")
@SuppressWarnings("serial")
public class MusteriEtiket extends PersistentObject {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;
		
	@Column(name = "ETIKET_ADI")
	private String etiketAdi;
	
	@Column(name = "DEGER_SAYISI")
	private String degerSayisi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DURUM_ID")
	@Fetch(FetchMode.SELECT)
	private Referans durum;

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public String getEtiketAdi() {
		return etiketAdi;
	}

	public void setEtiketAdi(String etiketAdi) {
		this.etiketAdi = etiketAdi;
	}

	public String getDegerSayisi() {
		return degerSayisi;
	}

	public void setDegerSayisi(String degerSayisi) {
		this.degerSayisi = degerSayisi;
	}

	public Referans getDurum() {
		return durum;
	}

	public void setDurum(Referans durum) {
		this.durum = durum;
	}
		
}
