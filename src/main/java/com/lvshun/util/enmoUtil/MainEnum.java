package com.lvshun.util.enmoUtil;

/**
 * Created by Matthew on 17/4/25.
 */
public enum MainEnum {

    BANNER_STATUS_TRUE("0", "正常"),
    BANNER_STATUS_FALSE("1","关闭")
    ;
    private String code;

    private String message;

    private MainEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}
