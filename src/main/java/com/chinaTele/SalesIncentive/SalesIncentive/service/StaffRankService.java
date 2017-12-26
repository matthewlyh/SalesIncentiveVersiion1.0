package com.chinaTele.SalesIncentive.SalesIncentive.service;

import com.chinaTele.SalesIncentive.SalesIncentive.View.StaffRankModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffRankQuery;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface StaffRankService {
    public PagedData<StaffRankModel> query(StaffRankQuery query);

}
