package com.itheima.domain;

import java.io.Serializable;

/**
 * creater:litiecheng
 * createDate:2017-9-1
 * discription:商品分类JavaBean
 * indetail:
 *
 */
public class Category implements Serializable{
    private String cid;
    private String cname;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
