package com.tazegevrek.mubsis.domain.constant;


public enum RolEnum implements ReferansEnum {
	USER("USER");

    private String value;
    
    public static String GRUP = "ROL";

    private RolEnum(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return name();
    }


}
