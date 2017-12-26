package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.ChannelMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ChannelModel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelMapper channelmapper;

    public ChannelModel FindChannelById(int id)
    {
        return channelmapper.findChannelById(id);
    }
}
