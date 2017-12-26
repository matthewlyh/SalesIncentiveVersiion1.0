package com.chinaTele.SalesIncentive.SalesIncentive.service;

import com.chinaTele.SalesIncentive.SalesIncentive.View.CustOrderViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface CustOrderViewService {
    public PagedData<CustOrderViewModel> query(CustOrderViewQuery query);
}
