package com.chinaTele.SalesIncentive.SalesIncentive.model;

/**
 * Created by Administrator on 2017/10/26.
 */
public class CustOrderModel {
    private int cust_order_id;
    private int staff_id;
    private int channel_id;
    private int  prod_offer_id;
    private int  lan_id;
    private int  status_cd;
    private String  cust_order_date;
    private String  attr_value_2;
    private String  attr_value_3;

    public int getCust_order_id() {
        return cust_order_id;
    }

    public void setCust_order_id(int cust_order_id) {
        this.cust_order_id = cust_order_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    public int getProd_offer_id() {
        return prod_offer_id;
    }

    public void setProd_offer_id(int prod_offer_id) {
        this.prod_offer_id = prod_offer_id;
    }

    public int getLan_id() {
        return lan_id;
    }

    public void setLan_id(int lan_id) {
        this.lan_id = lan_id;
    }

    public int getStatus_cd() {
        return status_cd;
    }

    public void setStatus_cd(int status_cd) {
        this.status_cd = status_cd;
    }

    public String getCust_order_date() {
        return cust_order_date;
    }

    public void setCust_order_date(String cust_order_date) {
        this.cust_order_date = cust_order_date;
    }

    public String getAttr_value_2() {
        return attr_value_2;
    }

    public void setAttr_value_2(String attr_value_2) {
        this.attr_value_2 = attr_value_2;
    }

    public String getAttr_value_3() {
        return attr_value_3;
    }

    public void setAttr_value_3(String attr_value_3) {
        this.attr_value_3 = attr_value_3;
    }
}
