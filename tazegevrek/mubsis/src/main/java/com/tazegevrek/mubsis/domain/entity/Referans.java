package com.tazegevrek.mubsis.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.tazegevrek.common.db.PersistentObject;

@Entity
@Table(name = "REFERANS")
@SuppressWarnings("serial")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Referans extends PersistentObject{
	
	@Column(name = "KOD", nullable = false,unique = true)
	private String kod;
	
	@Column(name = "ACIKLAMA", nullable = false)
	private String aciklama;
	
	@Column(name = "GRUP", nullable = false)
	private String grup;

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getGrup() {
		return grup;
	}

	public void setGrup(String grup) {
		this.grup = grup;
	}

}
