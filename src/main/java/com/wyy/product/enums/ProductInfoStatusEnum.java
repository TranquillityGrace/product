package com.wyy.product.enums;

public enum ProductInfoStatusEnum {

    UP(0,"上架"),

    DOWN(1,"下架"),

    ;

    private Integer code;
    private String message;

    ProductInfoStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
