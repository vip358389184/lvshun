package com.lvshun.po;

import java.math.BigDecimal;

/**
 * Created by 宝龙 on 2017/4/20.
 */
public class Commodity {
    private String CommodityId;//
    private String cId;//
    private String cName;
    private String brand;
    private String picture;
    private BigDecimal normalPrice;
    private BigDecimal retailPrice;
    private String cState;
    private String introduce;
    private String propertys;
    private String label;
    private String inventory;
    private String broadHeading;
    private String subclass;
    private String cDate;
    private String userId;

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getCommodityId() {
        return CommodityId;
    }

    public void setCommodityId(String commodityId) {
        CommodityId = commodityId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getcState() {
        return cState;
    }

    public void setcState(String cState) {
        this.cState = cState;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPropertys() {
        return propertys;
    }

    public void setPropertys(String propertys) {
        this.propertys = propertys;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getBroadHeading() {
        return broadHeading;
    }

    public void setBroadHeading(String broadHeading) {
        this.broadHeading = broadHeading;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
