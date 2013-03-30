package com.tazegevrek.mubsis.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "ISLEM")
@SuppressWarnings("serial")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Islem extends PersistentObject {

	@Column(name = "ACIKLAMA")
	private String aciklama;
	
	@Column(name = "DURUM_ID")
	private String durum;

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}


	
}
