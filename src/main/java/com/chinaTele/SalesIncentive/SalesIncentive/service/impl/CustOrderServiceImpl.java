package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.CustOrderMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;
import com.chinaTele.SalesIncentive.SalesIncentive.service.CustOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class CustOrderServiceImpl implements CustOrderService {

    @Autowired
    private CustOrderMapper custrdermapper;

    public CustOrderModel FindCustOrderByID(int cust_order_id)
    {
        //System.out.println("cust_order_id："+cust_order_id);
        return custrdermapper.findCustById(cust_order_id);
    }

    public boolean FindCustOrderId(int id)
    {
        boolean T=false;
        CustOrderModel custOrderModel=custrdermapper.findCustById(id);
        if (custOrderModel!=null)
            if (custOrderModel.getStatus_cd() == 1)
                T= true;
        return T;
    }
    public void updateCustOrder(int id)
    {
        custrdermapper.updateCustOrder(id);
    }

}
