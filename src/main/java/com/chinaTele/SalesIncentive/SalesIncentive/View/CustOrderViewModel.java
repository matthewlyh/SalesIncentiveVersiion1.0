package com.chinaTele.SalesIncentive.SalesIncentive.View;

/**
 * Created by Administrator on 2017/10/26.
 */
public class CustOrderViewModel {
    private int cust_order_id;
    private String  cust_order_date;
    private int  status_cd;
    private int offer_type;
    private float gold;

    public int getCust_order_id() {
        return cust_order_id;
    }

    public void setCust_order_id(int cust_order_id) {
        this.cust_order_id = cust_order_id;
    }

    public String getCust_order_date() {
        return cust_order_date;
    }

    public void setCust_order_date(String cust_order_date) {
        this.cust_order_date = cust_order_date;
    }

    public int getStatus_cd() {
        return status_cd;
    }

    public void setStatus_cd(int status_cd) {
        this.status_cd = status_cd;
    }

    public int getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(int offer_type) {
        this.offer_type = offer_type;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }
}
