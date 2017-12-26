package com.chinaTele.SalesIncentive.SalesIncentive.service;

import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface CustOrderService {

    CustOrderModel FindCustOrderByID(int cust_order_id);
    boolean FindCustOrderId(int id);
    void updateCustOrder(int id);

}
