package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.View.CustOrderViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderViewQuery;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface CustOrderViewMapper {
    CustOrderViewModel findViewById(int id);
    public List<CustOrderViewModel> queryList(CustOrderViewQuery query);
    int countList(CustOrderViewQuery query);
}
