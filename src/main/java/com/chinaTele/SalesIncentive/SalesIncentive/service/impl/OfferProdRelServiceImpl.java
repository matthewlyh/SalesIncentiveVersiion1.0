package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.OfferProdRelMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.OfferProdRel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.OfferProdRelService;
@Component
public class OfferProdRelServiceImpl implements OfferProdRelService {

	@Autowired
	OfferProdRelMapper offerProdRelMapper;
	
	@Override
	public OfferProdRel selectByPrimaryKey(Integer prodofferid) {
		// TODO 自动生成的方法存根
		return offerProdRelMapper.selectByPrimaryKey(prodofferid);
		 
	}

}
