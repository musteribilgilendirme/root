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
@Table(name = "TAHSILAT")
@SuppressWarnings("serial")
public class Tahsilat extends PersistentObject {

	@Temporal(TemporalType.DATE)
	@Column(name = "ISLEM_TARIHI", nullable = false)
	private Date islemTarihi;

	@Column(name = "TUTAR", nullable = false)
	private Long tutar;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KULLANICI_ID")
	@Fetch(FetchMode.SELECT)
	private Kullanici kullanici;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIRKET_ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;

	@Column(name = "TAHSILAT_TIPI_ID")
	private String tahsilatTipi;
	
	@Column(name = "ONCEKI_AVANS", nullable = false)
	private Long oncekiAvans;

	public Date getIslemTarihi() {
		return islemTarihi;
	}

	public void setIslemTarihi(Date islemTarihi) {
		this.islemTarihi = islemTarihi;
	}

	public Long getTutar() {
		return tutar;
	}

	public void setTutar(Long tutar) {
		this.tutar = tutar;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}

	public String getTahsilatTipi() {
		return tahsilatTipi;
	}

	public void setTahsilatTipi(String tahsilatTipi) {
		this.tahsilatTipi = tahsilatTipi;
	}

	public Long getOncekiAvans() {
		return oncekiAvans;
	}

	public void setOncekiAvans(Long oncekiAvans) {
		this.oncekiAvans = oncekiAvans;
	}
	
	
	
	
}
