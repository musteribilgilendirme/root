package com.tazegevrek.mubsis.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "IL")
@SuppressWarnings("serial")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Il extends PersistentObject{

	@Column(name = "AD")
	private String ad;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DURUM_ID",insertable=false,updatable=false)
	@Fetch(FetchMode.SELECT)
	private Referans durum;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Referans getDurum() {
		return durum;
	}

	public void setDurum(Referans durum) {
		this.durum = durum;
	}
	
}
