package com.chinaTele.SalesIncentive.SalesIncentive.controller;

import com.chinaTele.SalesIncentive.SalesIncentive.View.CustOrderViewModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.BooleanT;
import com.chinaTele.SalesIncentive.SalesIncentive.model.CustOrderModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.GoldModel;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProdOfferModel;
import com.chinaTele.SalesIncentive.SalesIncentive.query.CustOrderViewQuery;
import com.chinaTele.SalesIncentive.SalesIncentive.query.PagedData;
import com.chinaTele.SalesIncentive.SalesIncentive.service.CustOrderService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.GoldService;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ProdOfferService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/10/26.
 */
@Controller
public class GoldController {


    @Autowired
    private GoldService goldService;

    @Autowired
    private CustOrderService custOrderService;

    @Autowired
    private ProdOfferService prodOfferService;


    @RequestMapping("/InsertGold")
    @ResponseBody
    @CrossOrigin
    public BooleanT FindCustViewId(HttpServletRequest request) {
    	BooleanT T=new BooleanT();
    	boolean bool=false;
        System.out.println("启动程序CustCoderController：FindCustViewId");
        Object Cust_Order_ID = request.getParameter("id");
        CustOrderModel custOrderModel=custOrderService.FindCustOrderByID(Integer.valueOf(Cust_Order_ID.toString()));
        ProdOfferModel prodOfferModel=prodOfferService.FindProdOfferById(custOrderModel.getProd_offer_id());
        int status_cd=custOrderModel.getStatus_cd();
        if (status_cd==1)
        {
	        GoldModel gm=new GoldModel();
	        gm.setCust_order_id(custOrderModel.getCust_order_id());
	        gm.setChannel_id(custOrderModel.getChannel_id());
	        gm.setGold(prodOfferModel.getGold());
	        gm.setLan_id(custOrderModel.getLan_id());
	        gm.setStaff_id(custOrderModel.getStaff_id());
	        gm.setProd_offer_id(gm.getProd_offer_id());
	       
            bool=goldService.insertGold(gm);
	        if(bool)
	            custOrderService.updateCustOrder(gm.getCust_order_id());
        }
        T.setBool(bool);
        return(T);
    }


}
