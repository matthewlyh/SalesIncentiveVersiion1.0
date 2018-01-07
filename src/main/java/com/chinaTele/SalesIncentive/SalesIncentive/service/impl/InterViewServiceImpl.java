package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.InterViewMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.InterViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.InterViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.service.InterViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class InterViewServiceImpl implements InterViewService {

    @Autowired
    private InterViewMapper interViewMapper;


    public InterViewModel findInterViewById(int id)
    {
        return interViewMapper.findViewById(id);

    }

    public PagedData<InterViewModel> query(InterViewQuery query)
    {
        PagedData pagedData=new PagedData();
        List<InterViewModel> taskConfigDOs = interViewMapper.queryList(query);
        pagedData.setList(taskConfigDOs);
        if (taskConfigDOs != null && !taskConfigDOs.isEmpty()) {
            pagedData.setTotalNum(interViewMapper.countList(query));
        }
        return pagedData;

    }
}
