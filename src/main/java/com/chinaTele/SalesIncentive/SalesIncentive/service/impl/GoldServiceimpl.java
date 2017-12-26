package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.GoldMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.GoldModel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.GoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class GoldServiceimpl implements GoldService{
    @Autowired
    private GoldMapper goldMapper;

    public boolean insertGold(GoldModel goldModel)
    {

            goldMapper.insertGold(goldModel);
            return true;
    }
}
