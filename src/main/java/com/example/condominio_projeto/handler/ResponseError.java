package com.example.condominio_projeto.handler;

import java.util.Date;

public class ResponseError {
    private Date timeStemap = new Date();
    private String status = "error";
    private int statuscode = 400;
    private String error;

    public Date getTimeStemap() {
        return timeStemap;
    }

    public void setTimeStemap(Date timeStemap) {
        this.timeStemap = timeStemap;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(int statuscode) {
        this.statuscode = statuscode;
    }
}
