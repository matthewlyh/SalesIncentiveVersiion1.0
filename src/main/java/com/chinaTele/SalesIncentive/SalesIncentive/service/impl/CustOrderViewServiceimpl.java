package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.View.CustOrderViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.dao.CustOrderViewMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.service.CustOrderViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class CustOrderViewServiceimpl implements CustOrderViewService {

    @Autowired
    CustOrderViewMapper custOrderViewMapper;

    public PagedData<CustOrderViewModel> query(CustOrderViewQuery query) {

        if (query == null) {
            throw new IllegalArgumentException();
        }
        try {
            PagedData<CustOrderViewModel> pagedData = new PagedData<CustOrderViewModel>();
            pagedData.setPageNo(query.getPageNo());
            pagedData.setPageSize(query.getPageSize());

            List<CustOrderViewModel> taskConfigDOs = custOrderViewMapper.queryList(query);

            pagedData.setList(taskConfigDOs);

            if (taskConfigDOs != null && !taskConfigDOs.isEmpty() && query.getNeedPagedInfo()) {
                pagedData.setTotalNum(custOrderViewMapper.countList(query));
            }
            return pagedData;
        } catch (Exception e) {
//            throw new SeiyaException(location, e);
            return null;
        }
    }
}
