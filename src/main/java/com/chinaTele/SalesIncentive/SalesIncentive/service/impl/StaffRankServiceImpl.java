package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.View.StaffRankModel;
import com.chinaTele.SalesIncentive.SalesIncentive.dao.StaffRankMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.query.StaffRankQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.service.StaffRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class StaffRankServiceImpl implements StaffRankService {
    @Autowired
    private StaffRankMapper staffRankMapper;

    public PagedData<StaffRankModel> query(StaffRankQuery query)
    {

        if (query == null) {
            throw new IllegalArgumentException();
        }
        try {
            PagedData<StaffRankModel> pagedData = new PagedData<StaffRankModel>();
            pagedData.setPageNo(query.getPageNo());
            pagedData.setPageSize(query.getPageSize());
            List<StaffRankModel> taskConfigDOs = staffRankMapper.queryList(query);
            pagedData.setList(taskConfigDOs);

            if (taskConfigDOs != null && !taskConfigDOs.isEmpty()) {
                pagedData.setTotalNum(staffRankMapper.countList(query));
            }
            return pagedData;
        } catch (Exception e) {
//            throw new SeiyaException(location, e);
            return null;
        }
    }
}
