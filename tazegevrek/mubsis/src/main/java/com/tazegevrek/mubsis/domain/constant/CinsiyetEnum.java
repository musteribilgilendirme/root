package com.tazegevrek.mubsis.domain.constant;


public enum CinsiyetEnum implements ReferansEnum {
	ERKEK("CINSIYET.ERKEK"),KADIN("CINSIYET.KADIN");

    private String value;
    
    public static String GRUP = "CINSIYET";

    private CinsiyetEnum(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return name();
    }


}
