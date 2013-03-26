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
@Table(name = "TALEP")
@SuppressWarnings("serial")
public class Talep extends PersistentObject {

	
	@Column(name = "ADI")
	private Long adi;
	
	@Column(name = "ACIKLAMA")
	private Long aciklama;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "KOD")
	@Fetch(FetchMode.SELECT)
	private Referans talepDurumu;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BASLAMA_ZAMANI", nullable = false)
	private Date baslamaZamani;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BITIS_ZAMANI")
	private Date bitisZamani;
	
	@Column(name = "PARAMETRE",nullable=false)
	private String parametre;
	
	@Column(name = "TEKRAR")
	private String tekrar;
	
	@Column(name = "MAX_SAYI",nullable=false)
	private Long maxBilgilendirmeSayisi;
	
	@Column(name = "MAX_TUTAR", nullable=false)
	private Long maxBilgilendirmeTutari;
	
	@Column(name = "MALIYET")
	private Long maliyet;
	
	@Column(name = "BLOKE_TUTARI")
	private Long blokeTutari;
	
	@Column(name = "IADE_TUTARI")
	private Long iadeTutari;
	
	@Column(name = "NET_TUTAR")
	private Long netTutar;
	
	@Column(name = "ONIZLEME_SAYISI")
	private Long onizlemedekiBilgilendirmeSayisi;
	
	@Column(name = "ONIZLEME_TUTARI")
	private Long onizlemeBilgilendirmeTutari;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "KOD")
	@Fetch(FetchMode.SELECT)
	private Referans talepTipi;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Sablon sablon;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID")
	@Fetch(FetchMode.SELECT)
	private Sirket sirket;

	public Long getAdi() {
		return adi;
	}

	public void setAdi(Long adi) {
		this.adi = adi;
	}

	public Long getAciklama() {
		return aciklama;
	}

	public void setAciklama(Long aciklama) {
		this.aciklama = aciklama;
	}

	public Referans getTalepDurumu() {
		return talepDurumu;
	}

	public void setTalepDurumu(Referans talepDurumu) {
		this.talepDurumu = talepDurumu;
	}

	public Date getBaslamaZamani() {
		return baslamaZamani;
	}

	public void setBaslamaZamani(Date baslamaZamani) {
		this.baslamaZamani = baslamaZamani;
	}

	public Date getBitisZamani() {
		return bitisZamani;
	}

	public void setBitisZamani(Date bitisZamani) {
		this.bitisZamani = bitisZamani;
	}

	public String getParametre() {
		return parametre;
	}

	public void setParametre(String parametre) {
		this.parametre = parametre;
	}

	public String getTekrar() {
		return tekrar;
	}

	public void setTekrar(String tekrar) {
		this.tekrar = tekrar;
	}

	public Long getMaxBilgilendirmeSayisi() {
		return maxBilgilendirmeSayisi;
	}

	public void setMaxBilgilendirmeSayisi(Long maxBilgilendirmeSayisi) {
		this.maxBilgilendirmeSayisi = maxBilgilendirmeSayisi;
	}

	public Long getMaxBilgilendirmeTutari() {
		return maxBilgilendirmeTutari;
	}

	public void setMaxBilgilendirmeTutari(Long maxBilgilendirmeTutari) {
		this.maxBilgilendirmeTutari = maxBilgilendirmeTutari;
	}

	public Long getMaliyet() {
		return maliyet;
	}

	public void setMaliyet(Long maliyet) {
		this.maliyet = maliyet;
	}

	public Long getBlokeTutari() {
		return blokeTutari;
	}

	public void setBlokeTutari(Long blokeTutari) {
		this.blokeTutari = blokeTutari;
	}

	public Long getIadeTutari() {
		return iadeTutari;
	}

	public void setIadeTutari(Long iadeTutari) {
		this.iadeTutari = iadeTutari;
	}

	public Long getNetTutar() {
		return netTutar;
	}

	public void setNetTutar(Long netTutar) {
		this.netTutar = netTutar;
	}

	public Long getOnizlemedekiBilgilendirmeSayisi() {
		return onizlemedekiBilgilendirmeSayisi;
	}

	public void setOnizlemedekiBilgilendirmeSayisi(
			Long onizlemedekiBilgilendirmeSayisi) {
		this.onizlemedekiBilgilendirmeSayisi = onizlemedekiBilgilendirmeSayisi;
	}

	public Long getOnizlemeBilgilendirmeTutari() {
		return onizlemeBilgilendirmeTutari;
	}

	public void setOnizlemeBilgilendirmeTutari(Long onizlemeBilgilendirmeTutari) {
		this.onizlemeBilgilendirmeTutari = onizlemeBilgilendirmeTutari;
	}

	public Referans getTalepTipi() {
		return talepTipi;
	}

	public void setTalepTipi(Referans talepTipi) {
		this.talepTipi = talepTipi;
	}
	
	public Sablon getSablon() {
		return sablon;
	}

	public void setSablon(Sablon sablon) {
		this.sablon = sablon;
	}

	public Sirket getSirket() {
		return sirket;
	}

	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}
	
}
