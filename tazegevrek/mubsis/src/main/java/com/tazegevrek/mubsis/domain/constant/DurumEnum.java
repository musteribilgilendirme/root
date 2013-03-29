package com.tazegevrek.mubsis.domain.constant;


public enum DurumEnum implements ReferansEnum {
	AKTIF("DURUM.AKTIF"),PASIF("DURUM.PASIF"),MANTIKSAL_SILINMIS("DURUM.MANTIKSAK_SILINMIS");

    private String value;
    
    public static String GRUP = "DURUM";

    private DurumEnum(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return name();
    }


}
