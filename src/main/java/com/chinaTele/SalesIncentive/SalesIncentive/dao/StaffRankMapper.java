package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.View.StaffRankModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffRankQuery;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */

public interface StaffRankMapper {
    public List<StaffRankModel> queryList(StaffRankQuery query);
    int countList(StaffRankQuery query);
}
