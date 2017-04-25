package com.lvshun.po;

/**
 * Created by Matthew on 17/4/25.
 */
public class Banner {
        private String uuid;
        private String url;
        private String status;
        private String remark;

    public Banner() {
    }

    public Banner(String uuid, String url, String status, String remark) {
        this.uuid = uuid;
        this.url = url;
        this.status = status;
        this.remark = remark;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
