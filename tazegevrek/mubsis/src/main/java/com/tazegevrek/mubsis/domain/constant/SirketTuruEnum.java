package com.tazegevrek.mubsis.domain.constant;


public enum SirketTuruEnum implements ReferansEnum {
	BIREYSEL("SIRKET_TURU.BIREYSEL"),KURUMSAL("SIRKET_TURU.KURUMSAL"),SANAL("SIRKET_TURU.SANAL");

    private String value;
    
    public static String GRUP = "SIRKET_TURU";

    private SirketTuruEnum(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return name();
    }


}
