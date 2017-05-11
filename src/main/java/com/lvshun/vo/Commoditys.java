package com.lvshun.vo;

import java.math.BigDecimal;

/**
 * Created by 宝龙 on 2017/5/10.
 */
public class Commoditys {
    private String Commodity_id;//
    private String c_id;//
    private String c_name;
    private String brand;
    private String picture;
    private BigDecimal normal_price;
    private BigDecimal retail_price;
    private String c_state;
    private String introduce;
    private String property;
    private String label;
    private String inventory;
    private String broad_heading;
    private String subclass;
    private String cdate;
    private String user_id;

    public Commoditys() {
        super();
    }

    @Override
    public String toString() {
        return "Commoditys{" +
                "Commodity_id='" + Commodity_id + '\'' +
                ", c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", brand='" + brand + '\'' +
                ", picture='" + picture + '\'' +
                ", normal_price=" + normal_price +
                ", retail_price=" + retail_price +
                ", c_state='" + c_state + '\'' +
                ", introduce='" + introduce + '\'' +
                ", property='" + property + '\'' +
                ", label='" + label + '\'' +
                ", inventory='" + inventory + '\'' +
                ", broad_heading='" + broad_heading + '\'' +
                ", subclass='" + subclass + '\'' +
                ", cdate='" + cdate + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }

    public String getCommodity_id() {
        return Commodity_id;
    }

    public void setCommodity_id(String commodity_id) {
        Commodity_id = commodity_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
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

    public BigDecimal getNormal_price() {
        return normal_price;
    }

    public void setNormal_price(BigDecimal normal_price) {
        this.normal_price = normal_price;
    }

    public BigDecimal getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(BigDecimal retail_price) {
        this.retail_price = retail_price;
    }

    public String getC_state() {
        return c_state;
    }

    public void setC_state(String c_state) {
        this.c_state = c_state;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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

    public String getBroad_heading() {
        return broad_heading;
    }

    public void setBroad_heading(String broad_heading) {
        this.broad_heading = broad_heading;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
