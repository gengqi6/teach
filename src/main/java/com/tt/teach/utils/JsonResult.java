package com.tt.teach.utils;

public class JsonResult {
    //响应状态码
    private Integer status;
    //响应消息
    private String msg;
    //响应数据
    private Object myData;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getMyData() {
        return myData;
    }

    public void setMyData(Object myData) {
        this.myData = myData;
    }

    public JsonResult() {
    }

    public JsonResult(Integer status, String msg, Object myData) {
        this.status = status;
        this.msg = msg;
        this.myData = myData;
    }

   //成功的时候调用ok
    public static JsonResult ok(String msg, Object myData) {
        return new JsonResult(200,msg,myData);
    }

    //失败的时候调用no
    public static JsonResult no(String msg, Object myData) {
        return new JsonResult(502,msg,myData);
    }
}
