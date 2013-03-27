package com.tazegevrek.common.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class PersistentObject implements Serializable {

	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "gen")
	@Column(name = "ID", nullable = false)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TANITIM_ZAMANI", nullable = false)
	private Date tanitimZamani;

	@Column(name = "TANITAN_KULLANICI_KODU", nullable = false)
	private String tanimlayanKullaniciKodu;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "GUNCELLEME_ZAMANI")
	private Date guncellemeZamani;

	@Column(name = "GUNCELLEYEN_KULLANICI_KODU")
	private String guncelleyenKullaniciKodu;

	@Version
	@Column(name = "VERSIYON", nullable = false)
	private int versiyon = 0;

	protected void copy(final PersistentObject source) {
		this.id = source.id;
		this.tanitimZamani = source.tanitimZamani;
		this.tanimlayanKullaniciKodu = source.tanimlayanKullaniciKodu;
		this.guncellemeZamani = source.guncellemeZamani;
		this.guncelleyenKullaniciKodu = source.guncelleyenKullaniciKodu;
		this.versiyon = source.versiyon;
	}

	protected static boolean getBooleanValue(final Boolean value) {
		return Boolean.valueOf(String.valueOf(value));
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PersistentObject)) {
			return false;
		}
		final PersistentObject other = (PersistentObject) obj;
		if (this.id != null && other.id != null) {
			if (this.id != other.id) {
				return false;
			}
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTanitimZamani() {
		return tanitimZamani;
	}

	public void setTanitimZamani(Date tanitimZamani) {
		this.tanitimZamani = tanitimZamani;
	}

	public String getTanimlayanKullaniciKodu() {
		return tanimlayanKullaniciKodu;
	}

	public void setTanimlayanKullaniciKodu(String tanimlayanKullaniciKodu) {
		this.tanimlayanKullaniciKodu = tanimlayanKullaniciKodu;
	}

	public Date getGuncellemeZamani() {
		return guncellemeZamani;
	}

	public void setGuncellemeZamani(Date guncellemeZamani) {
		this.guncellemeZamani = guncellemeZamani;
	}

	public String getGuncelleyenKullaniciKodu() {
		return guncelleyenKullaniciKodu;
	}

	public void setGuncelleyenKullaniciKodu(String guncelleyenKullaniciKodu) {
		this.guncelleyenKullaniciKodu = guncelleyenKullaniciKodu;
	}

	public int getVersiyon() {
		return versiyon;
	}

	public void setVersiyon(int versiyon) {
		this.versiyon = versiyon;
	}

}
