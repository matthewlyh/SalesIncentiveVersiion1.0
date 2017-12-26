package com.chinaTele.SalesIncentive.SalesIncentive.model;

/**
 * Created by Administrator on 2017/10/25.
 */
public class ProdOfferModel {
    private int prod_offer_id;
    private String prod_offer_name;
    private int offer_type;
    private int status_cd;
    private String status_date;
    private float gold;
    private String attr_value_1;
    private String attr_value_2;
    private String attr_value_3;

    public int getProd_offer_id() {
        return prod_offer_id;
    }

    public void setProd_offer_id(int prod_offer_id) {
        this.prod_offer_id = prod_offer_id;
    }

    public String getProd_offer_name() {
        return prod_offer_name;
    }

    public void setProd_offer_name(String prod_offer_name) {
        this.prod_offer_name = prod_offer_name;
    }

    public int getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(int offer_type) {
        this.offer_type = offer_type;
    }

    public int getStatus_cd() {
        return status_cd;
    }

    public void setStatus_cd(int status_cd) {
        this.status_cd = status_cd;
    }

    public String getStatus_date() {
        return status_date;
    }

    public void setStatus_date(String status_date) {
        this.status_date = status_date;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public String getAttr_value_1() {
        return attr_value_1;
    }

    public void setAttr_value_1(String attr_value_1) {
        this.attr_value_1 = attr_value_1;
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
