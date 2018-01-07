package com.chinaTele.SalesIncentive.SalesIncentive.dao;

import com.chinaTele.SalesIncentive.SalesIncentive.model.OfferProdRel;

public interface OfferProdRelMapper {
    int deleteByPrimaryKey(Integer offerProdRelId);

    int insert(OfferProdRel record);

    int insertSelective(OfferProdRel record);

    OfferProdRel selectByPrimaryKey(Integer prodOfferid);

    int updateByPrimaryKeySelective(OfferProdRel record);

    int updateByPrimaryKey(OfferProdRel record);
}