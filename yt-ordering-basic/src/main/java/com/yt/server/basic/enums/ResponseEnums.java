package com.yt.server.basic.enums;

/**
 * @author liuxf
 * @version 1.0
 * @date 2020/5/8 16:25
 */
public enum ResponseEnums {

    SUCCESS(9000, "OK"),
    FAIL(9999, "FAIL");

    private  int code;
    private  String msg;

    ResponseEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ResponseEnums valueOf(int code) {
        for (ResponseEnums httpStatus : values()) {
            if (httpStatus.getCode() == code) {
                return httpStatus;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + code + "]");
    }

}
