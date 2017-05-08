package com.lvshun.po;

import java.math.BigDecimal;

/**
 * Created by 宝龙 on 2017/4/20.
 */
public class OrderList {
    private  String snumberId;
    private  String oId;
    private  String oName;
    private  String oProperty;
    private  String cNumber;
    private  String deliveryCosts;
    private BigDecimal money;
    private  String oState;
    private  String  userId;
    private  String address;
    private  String sMethod;
    private  String popayMent;
    private  String  presentExp;
    private  String oxdDate;
    private  String  osongDate;
    private  String oshDate;
    private  String  ofkDate;
    private  String  orderTime;

    public String getSnumberId() {
        return snumberId;
    }

    public void setSnumberId(String snumberId) {
        this.snumberId = snumberId;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public String getoProperty() {
        return oProperty;
    }

    public void setoProperty(String oProperty) {
        this.oProperty = oProperty;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public String getDeliveryCosts() {
        return deliveryCosts;
    }

    public void setDeliveryCosts(String deliveryCosts) {
        this.deliveryCosts = deliveryCosts;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getoState() {
        return oState;
    }

    public void setoState(String oState) {
        this.oState = oState;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getsMethod() {
        return sMethod;
    }

    public void setsMethod(String sMethod) {
        this.sMethod = sMethod;
    }

    public String getPopayMent() {
        return popayMent;
    }

    public void setPopayMent(String popayMent) {
        this.popayMent = popayMent;
    }

    public String getPresentExp() {
        return presentExp;
    }

    public void setPresentExp(String presentExp) {
        this.presentExp = presentExp;
    }

    public String getOxdDate() {
        return oxdDate;
    }

    public void setOxdDate(String oxdDate) {
        this.oxdDate = oxdDate;
    }

    public String getOsongDate() {
        return osongDate;
    }

    public void setOsongDate(String osongDate) {
        this.osongDate = osongDate;
    }

    public String getOshDate() {
        return oshDate;
    }

    public void setOshDate(String oshDate) {
        this.oshDate = oshDate;
    }

    public String getOfkDate() {
        return ofkDate;
    }

    public void setOfkDate(String ofkDate) {
        this.ofkDate = ofkDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}
