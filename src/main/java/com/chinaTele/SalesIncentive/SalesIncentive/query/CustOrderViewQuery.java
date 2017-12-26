package com.chinaTele.SalesIncentive.SalesIncentive.query;

/**
 * Created by Administrator on 2017/10/26.
 */
public class CustOrderViewQuery extends BaseQuery {
    private int cust_order_id;
    private String  cust_order_date;
    private int  status_cd;

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
}
