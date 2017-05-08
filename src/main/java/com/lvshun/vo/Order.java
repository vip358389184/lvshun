package com.lvshun.vo;

/**
 * Created by Matthew on 17/5/5.
 */
public class Order {

    private String uuid;
    private String orderId;
    private String orderName;
    private String orderAmt;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public Order() {
    }

    public Order(String uuid, String orderId, String orderName, String orderAmt) {
        this.uuid = uuid;
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderAmt = orderAmt;
    }
}
