package com.chinaTele.SalesIncentive.SalesIncentive.query;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.ProdOfferMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProdOfferModel;

/**
 * Created by Administrator on 2017/10/26.
 */
public class CustOrderQuery {
    private int cust_order_id;
    private int  prod_offer_id;
    private String  cust_order_date;
    private int offer_type;
    private float gold;
    private boolean bool;

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public int getCust_order_id() {
        return cust_order_id;
    }

    public void setCust_order_id(int cust_order_id) {
        this.cust_order_id = cust_order_id;
    }

    public int getProd_offer_id() {
        return prod_offer_id;
    }

    public void setProd_offer_id(int prod_offer_id) {
        this.prod_offer_id = prod_offer_id;
    }

    public String getCust_order_date() {
        return cust_order_date;
    }

    public void setCust_order_date(String cust_order_date) {
        this.cust_order_date = cust_order_date;
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
