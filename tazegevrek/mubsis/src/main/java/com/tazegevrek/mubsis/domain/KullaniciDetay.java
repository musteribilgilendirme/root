package com.tazegevrek.mubsis.domain;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import com.tazegevrek.mubsis.domain.entity.Kullanici;

@SuppressWarnings("serial")
public class KullaniciDetay implements UserDetails{

	private String rol;
	private String sifre;
	private String kullaniciKodu;
	private boolean hesabinKullanimSuresiDolduMu;
	private boolean hesapKilitliDegilMi;
	private boolean sertifikaGecerliligiDolduMu;
	private boolean aktifMi;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {       
		Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		if(StringUtils.hasText(rol)){       	
        	GrantedAuthority authority = new GrantedAuthority() {	
				@Override
				public String getAuthority() {
					return rol;
				}
			};
			authorities.add(authority);
        }
		return authorities;
	}

	@Override
	public String getPassword() {
		return sifre;
	}

	@Override
	public String getUsername() {
		return kullaniciKodu;
	}

	@Override
	public boolean isAccountNonExpired() {
		return hesabinKullanimSuresiDolduMu;
	}

	@Override
	public boolean isAccountNonLocked() {
		return hesapKilitliDegilMi;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return sertifikaGecerliligiDolduMu;
	}

	@Override
	public boolean isEnabled() {
		return aktifMi;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getKullaniciKodu() {
		return kullaniciKodu;
	}

	public void setKullaniciKodu(String kullaniciKodu) {
		this.kullaniciKodu = kullaniciKodu;
	}

	public boolean isHesabinKullanimSuresiDolduMu() {
		return hesabinKullanimSuresiDolduMu;
	}

	public void setHesabinKullanimSuresiDolduMu(boolean hesabinKullanimSuresiDolduMu) {
		this.hesabinKullanimSuresiDolduMu = hesabinKullanimSuresiDolduMu;
	}

	public boolean isHesapKilitliDegilMi() {
		return hesapKilitliDegilMi;
	}

	public void setHesapKilitliDegilMi(boolean hesapKilitliDegilMi) {
		this.hesapKilitliDegilMi = hesapKilitliDegilMi;
	}

	public boolean isSertifikaGecerliligiDolduMu() {
		return sertifikaGecerliligiDolduMu;
	}

	public void setSertifikaGecerliligiDolduMu(boolean sertifikaGecerliligiDolduMu) {
		this.sertifikaGecerliligiDolduMu = sertifikaGecerliligiDolduMu;
	}

	public boolean isAktifMi() {
		return aktifMi;
	}

	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}
	
	
	
}
