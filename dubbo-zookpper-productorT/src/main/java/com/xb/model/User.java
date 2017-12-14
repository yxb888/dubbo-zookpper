package com.xb.model;


import java.io.Serializable;
import java.util.Date;

class User implements Serializable{
    private static final long serialVersionUID = 1293979819537866850L;
    private String userid;

    private String username;

    private String userpwd;

    private String usermobile;

    private Integer userlock;

    private Date keyone;

    private String keytow;

    private String keytrhree;

    private String loginname;

    private Date createtime;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public Integer getUserlock() {
        return userlock;
    }

    public void setUserlock(Integer userlock) {
        this.userlock = userlock;
    }

    public Date getKeyone() {
        return keyone;
    }

    public void setKeyone(Date keyone) {
        this.keyone = keyone;
    }

    public String getKeytow() {
        return keytow;
    }

    public void setKeytow(String keytow) {
        this.keytow = keytow == null ? null : keytow.trim();
    }

    public String getKeytrhree() {
        return keytrhree;
    }

    public void setKeytrhree(String keytrhree) {
        this.keytrhree = keytrhree == null ? null : keytrhree.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}