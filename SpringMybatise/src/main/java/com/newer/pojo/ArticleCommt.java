package com.newer.pojo;

import java.sql.Date;

public class ArticleCommt {
    private Integer id;
    private Integer au_id;
    private Integer ar_id;
    private String commt;
    private Date commt_time;

    public ArticleCommt() {
    }

    public ArticleCommt(Integer id, Integer au_id, Integer ar_id, String commt, Date commt_time) {
        this.id = id;
        this.au_id = au_id;
        this.ar_id = ar_id;
        this.commt = commt;
        this.commt_time = commt_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public Integer getAr_id() {
        return ar_id;
    }

    public void setAr_id(Integer ar_id) {
        this.ar_id = ar_id;
    }

    public String getCommt() {
        return commt;
    }

    public void setCommt(String commt) {
        this.commt = commt;
    }

    public Date getCommt_time() {
        return commt_time;
    }

    public void setCommt_time(Date commt_time) {
        this.commt_time = commt_time;
    }
}
