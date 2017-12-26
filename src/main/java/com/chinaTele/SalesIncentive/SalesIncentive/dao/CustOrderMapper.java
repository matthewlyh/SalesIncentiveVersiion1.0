package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface CustOrderMapper {
   CustOrderModel findCustById(int cust_order_id);
   void updateCustOrder(int id);
}
