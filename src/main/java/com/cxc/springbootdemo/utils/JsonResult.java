package com.cxc.springbootdemo.utils;

public class JsonResult<T> {

    private T data;
    private int code;
    private String msg;

    public JsonResult(){
        this.code = 0;
        this.msg = "success";
    }

    public JsonResult(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public JsonResult(T data,String msg){
        this.code = 0;
        this.data = data;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
