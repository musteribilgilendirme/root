package com.tazegevrek.mubsis.service.kullanici;

import com.tazegevrek.mubsis.domain.KullaniciDetay;
import com.tazegevrek.mubsis.domain.constant.DurumEnum;
import com.tazegevrek.mubsis.domain.entity.Kullanici;


public class KullaniciServiceTranslator {

	public static KullaniciDetay kullanici2KullaniciDetay(Kullanici kullanici){
		KullaniciDetay detay = new KullaniciDetay();
		detay.setRol(kullanici.getRol());
		detay.setSifre(kullanici.getSifre());
		detay.setKullaniciKodu(kullanici.getKullaniciKodu());
		detay.setHesabinKullanimSuresiDolduMu(false);
		detay.setHesapKilitliDegilMi(true);
		detay.setSertifikaGecerliligiDolduMu(false);
		
		boolean aktifMi = kullanici.getDurum().getKey().equals(DurumEnum.AKTIF.getValue());
		detay.setAktifMi(aktifMi);
		return detay;
	}
	
}
