package com.sun.www.bean;

import java.util.Date;

/**
 * Created by suny on 2017/7/25.
 */
public class BaseBean {

    /*0未启用 1启用*/
    private Integer status;

    private Date createDate;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
