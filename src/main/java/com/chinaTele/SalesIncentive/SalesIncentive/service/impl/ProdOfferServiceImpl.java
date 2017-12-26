package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.ProdOfferMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProdOfferModel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ProdOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class ProdOfferServiceImpl implements ProdOfferService {

    @Autowired
    private ProdOfferMapper pom;

    public ProdOfferModel FindProdOfferById(int prod_offer_id)
    {
        System.out.println("FindProdOfferById:"+prod_offer_id);
        ProdOfferModel pm=new ProdOfferModel();
        pm=pom.findProdOfferById(prod_offer_id);
        return pm;
    }
}
