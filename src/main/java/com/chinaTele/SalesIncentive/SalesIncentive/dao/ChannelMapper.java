package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.model.ChannelModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProdOfferModel;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface ChannelMapper {
    ChannelModel findChannelById(int id);
}
