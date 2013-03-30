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
		detay.setHesabinKullanimSuresiDolduMu(true);
		detay.setHesapKilitliDegilMi(true);
		detay.setSertifikaGecerliligiDolduMu(true);
		
		boolean aktifMi = kullanici.getDurum().equals(DurumEnum.AKTIF.getValue());
		detay.setAktifMi(aktifMi);
		return detay;
	}
	
}
