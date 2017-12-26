package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.LanMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.LanModel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.LanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class LanServiceImpl implements LanService {

    @Autowired
    LanMapper lanMapper;

    public LanModel FindLanByID(int lan_id)
    {
       return  lanMapper.findLanById(lan_id);
    }

}
