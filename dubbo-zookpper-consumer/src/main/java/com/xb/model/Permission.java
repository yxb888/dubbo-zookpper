package com.xb.model;

import java.io.Serializable;

public class Permission implements Serializable{
    private static final long serialVersionUID = -1676516853217785445L;
    private String tId;

    private String tName;

    private String tText;

    private String tUrl;

    private String tPid;

    private String tLeaf;
    private String tIcon;

    public String gettIcon() {
        return tIcon;
    }

    public void settIcon(String tIcon) {
        this.tIcon = tIcon;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettText() {
        return tText;
    }

    public void settText(String tText) {
        this.tText = tText == null ? null : tText.trim();
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl == null ? null : tUrl.trim();
    }

    public String gettPid() {
        return tPid;
    }

    public void settPid(String tPid) {
        this.tPid = tPid == null ? null : tPid.trim();
    }

    public String gettLeaf() {
        return tLeaf;
    }

    public void settLeaf(String tLeaf) {
        this.tLeaf = tLeaf == null ? null : tLeaf.trim();
    }
}