package com.lsj.sell.utils;


import java.util.HashMap;

public class ResponseTools extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public ResponseTools() {
        super();
    }



    private ResponseTools(int code, Object data, String status) {
        super();
        this.put("code", code);
        this.put("status", status);
        this.put("data", data);
    }
    private ResponseTools(int code, Object data, String status, String token) {
        super();
        this.put("code", code);
        this.put("status", status);
        this.put("data", data);
        this.put("token", token);
    }
    private ResponseTools(int code, String errorMsg , String status) {
        super();
        this.put("code", code);
        this.put("status", status);
        this.put("errorMsg", errorMsg);
    }
    public static ResponseTools returnSuccess(Object data) {
        return new ResponseTools(CodeConstant.Code_200,data,"success");
    }

    public static ResponseTools returnSuccess(int code,String errorMsg) {
        return new ResponseTools(code,errorMsg,"success");
    }
    public static ResponseTools returnSuccess(Object data,String token) {
        return new ResponseTools(CodeConstant.Code_200,data,"success",token);
    }
    public static ResponseTools returnFail(int code,String errorMsg) {
        return new ResponseTools(code,errorMsg,"fail");
    }


}