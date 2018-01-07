package com.chinaTele.SalesIncentive.SalesIncentive.service;

import com.chinaTele.SalesIncentive.SalesIncentive.model.InterViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.InterViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
/**
 * Created by Administrator on 2017/10/27.
 */
public interface InterViewService {
    InterViewModel findInterViewById(int id);
    public PagedData<InterViewModel> query(InterViewQuery query);
}
